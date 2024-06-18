@file:OptIn(UnsafeWasmMemoryApi::class)

import kotlin.wasm.unsafe.*

class ComponentException(val value: Any?) : Throwable()

sealed interface Option<out T> {
  data class Some<T2>(val value: T2) : Option<T2>

  data object None : Option<Nothing>
}

internal value class ResourceHandle(internal val value: Int)

@WasmExport
fun cabi_realloc(ptr: Int, oldSize: Int, align: Int, newSize: Int): Int =
    componentModelRealloc(ptr, oldSize, newSize)

fun MemoryAllocator.STRING_TO_MEM(s: String): Int =
    writeToLinearMemory(s.encodeToByteArray()).address.toInt()

fun STRING_FROM_MEM(addr: Int, len: Int): String = loadByteArray(addr.ptr, len).decodeToString()

fun MALLOC(size: Int, align: Int): Int = TODO()

val Int.ptr: Pointer
  get() = Pointer(this.toUInt())

fun Pointer.loadUByte(): UByte = loadByte().toUByte()

fun Pointer.loadUShort(): UShort = loadShort().toUShort()

fun Pointer.loadUInt(): UInt = loadInt().toUInt()

fun Pointer.loadULong(): ULong = loadLong().toULong()

internal fun MemoryAllocator.writeToLinearMemory(value: String): Pointer =
    writeToLinearMemory(value.encodeToByteArray())

internal fun loadString(addr: Pointer, size: Int): String =
    loadByteArray(addr, size).decodeToString()

internal fun loadByteArray(addr: Pointer, size: Int): ByteArray =
    ByteArray(size) { i -> (addr + i).loadByte() }

internal fun MemoryAllocator.writeToLinearMemory(array: ByteArray): Pointer {
  val pointer = allocate(array.size)
  var currentPointer = pointer
  array.forEach {
    currentPointer.storeByte(it)
    currentPointer += 1
  }
  return pointer
}

fun Pointer.loadFloat(): Float = Float.fromBits(loadInt())

fun Pointer.loadDouble(): Double = Double.fromBits(loadLong())

fun Pointer.storeFloat(value: Float) {
  storeInt(value.toRawBits())
}

fun Pointer.storeDouble(value: Double) {
  storeLong(value.toRawBits())
}

internal object RepTable {
  private val list = mutableListOf<Any>()

  private var firstVacant: Int? = null

  private data class Vacant(var next: Int?)

  fun add(v: Any): Int {
    val rep: Int
    if (firstVacant != null) {
      rep = firstVacant!!
      firstVacant = (list[rep] as Vacant).next
      list[rep] = v
    } else {
      rep = list.size
      list += v
    }
    return rep
  }

  fun get(rep: Int): Any {
    check(list[rep] !is Vacant)
    return list[rep]
  }

  fun remove(rep: Int): Any {
    val v = get(rep)
    list[rep] = Vacant(firstVacant)
    firstVacant = rep
    return v
  }

  override fun toString(): String {
    return "RepTable(firstVacant=${firstVacant}, list = $list)"
  }
}
