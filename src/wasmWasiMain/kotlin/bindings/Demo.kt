// Generated by `wit-bindgen` 0.24.0. DO NOT EDIT!

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

fun STRING_FROM_MEM(addr: Int, len: Int): String =
loadByteArray(addr.ptr, len).decodeToString()

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
fun Pointer.storeFloat(value: Float) { storeInt(value.toRawBits()) }
fun Pointer.storeDouble(value: Double) { storeLong(value.toRawBits()) }

// -------------------------------------------------------

object Ui {

  /**
  Shape of a button.
  */
  enum class Shape {
    RECTANGLE,
    ROUNDED,
    CIRCLE,
  }

  /**
  RGB color with red, green, and blue components.
  */
  data class Rgb(
  var r: UByte,
  var g: UByte,
  var b: UByte,
  )
  /**
  Color for UI elements.
  */
  sealed interface Color{ 
    data class Rgb(val value: Ui.Rgb) : Color
    data class Hex(val value: String) : Color
  }
  /**
  Modifiers for UI elements.
  */
  value class Modifiers internal constructor(val _value: Long) {
    constructor(
    outlined: Boolean = false,shadow: Boolean = false,gradient: Boolean = false,
    ) : this(0L or (if (outlined) (1L shl 0) else 0L) or (if (shadow) (1L shl 1) else 0L) or (if (gradient) (1L shl 2) else 0L))
    val outlined: Boolean get() = (_value and (1L shl 0)) != 0L
    val shadow: Boolean get() = (_value and (1L shl 1)) != 0L
    val gradient: Boolean get() = (_value and (1L shl 2)) != 0L
  }
  /**
  Create a button with specified attributes.
  */
  public fun createButton(label: String, shape: Ui.Shape, color: Ui.Color, modifiers: Ui.Modifiers?): Unit {
    withScopedMemoryAllocator { allocator -> 

    val bytearray = label.encodeToByteArray()
    val len = bytearray.size
    val ptr = allocator.writeToLinearMemory(bytearray).address.toInt()

    // VariantLower START
    val variant: Int
    val variant4: Int
    val variant5: Int
    val variant6: Int
    when (val x = color) {
      is Ui.Color.Rgb -> {
        val payload = x.value
        variant = 0;
        variant4 = payload.r.toInt();
        variant5 = payload.g.toInt();
        variant6 = payload.b.toInt();
      }
      is Ui.Color.Hex -> {
        val payload0 = x.value

        val bytearray3 = payload0.encodeToByteArray()
        val len2 = bytearray3.size
        val ptr1 = allocator.writeToLinearMemory(bytearray3).address.toInt()

        variant = 1;
        variant4 = ptr1;
        variant5 = len2;
        variant6 = 0;
      }
      else -> error("unreachable")
    }
    // VariantLower END
    val option: Int
    val option9: Int
    val payload8 = modifiers
    if (payload8 != null) {
      option = 1
      option9 = payload8._value.toInt()
    } else {
      option = 0
      option9 = 0
    }
    __wasm_import_createButton(ptr, len, shape.ordinal, variant, variant4, variant5, variant6, option, option9)
    freeAllComponentModelReallocAllocatedMemory();
  }
}
/**
Create an HTML text area with specified content.
*/
public fun createHtmlTextArea(html: String): Unit {
  withScopedMemoryAllocator { allocator -> 

  val bytearray = html.encodeToByteArray()
  val len = bytearray.size
  val ptr = allocator.writeToLinearMemory(bytearray).address.toInt()

  __wasm_import_createHtmlTextArea(ptr, len)
  freeAllComponentModelReallocAllocatedMemory();
}
}

}

@WasmImport("component-model:example/ui", "create-button")
private external fun __wasm_import_createButton(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Unit

@WasmImport("component-model:example/ui", "create-html-text-area")
private external fun __wasm_import_createHtmlTextArea(p0: Int, p1: Int): Unit


object Markdown {
  /**
  Converts Markdown-formatted text to HTML.
  */
  public fun convertMarkdownToHtml(markdown: String): String {
    withScopedMemoryAllocator { allocator -> 

    val bytearray = markdown.encodeToByteArray()
    val len = bytearray.size
    val ptr = allocator.writeToLinearMemory(bytearray).address.toInt()

    val ptr0 = /* RETURN_ADDRESS_ALLOC(size=8, align=4)*/ allocator.allocate(8).address.toInt()
    __wasm_import_convertMarkdownToHtml(ptr, len, ptr0)
    freeAllComponentModelReallocAllocatedMemory();
    return STRING_FROM_MEM((ptr0 + 0).ptr.loadInt(), (ptr0 + 4).ptr.loadInt())
  }
}

}

@WasmImport("component-model:example/markdown", "convert-markdown-to-html")
private external fun __wasm_import_convertMarkdownToHtml(p0: Int, p1: Int, p2: Int): Unit


interface RunExports {
  fun run(): Unit

}

@WasmExport("component-model:example/run#run")
fun __wasm_export_run(): Unit {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator -> 

  RunExportsImpl.run()

}
}

