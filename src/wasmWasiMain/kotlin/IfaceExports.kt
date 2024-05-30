object IfaceExportsImpl : IfaceExports {
    override fun markdownToHtml(x: String): String = Iface.markdownToHtml(x)
    override fun test1(p1: Boolean, p2: Byte, p3: Short, p4: Int, p5: Long, p6: UByte, p7: UShort, p8: UInt, p9: ULong, p10: Int): String =
        Iface.test1(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
    override fun test2(x: List<String?>): List<String> =
        Iface.test2(x)

    override fun test3(x: Option<Option<Int?>>): Int = Iface.test3(x)
    override fun testRecord(x: IfaceExports.Ab): IfaceExports.Ab = IfaceExports.Ab(x.a + "_kt", x.b + "_kt")
    override fun testResult(x: Boolean): Result<Int> = Iface.testResult(x)
    override fun testTuple(x1: Boolean, x2: Pair<Boolean, String>, x3: Triple<Boolean, String, Int>): Tuple6<Boolean, Boolean, String, Boolean, String, Int> =
        Iface.testTuple(x1, x2, x3)
    override fun testVariant(x: IfaceExports.V): IfaceExports.V = x
    override fun testEnum(x: IfaceExports.Color): Int = x.ordinal
    override fun testFlags(x: IfaceExports.Fg): String = x.toString()
}

object TestExportsImpl : TestExports {
    override fun test() {
        println("\n-- Testing markdown to HTML")
        val html = Iface.markdownToHtml(
            """
            - First item
            - Second item
            - Third item
                - Indented item 1
                - Indented item 2
            - Fourth item
            """.trimIndent()
        )
        println(html)

        println("\n-- Testing primitives")
        println(
            Iface.test1(
                true,
                1.toByte(),
                2.toShort(),
                3.toInt(),
                4.toLong(),
                5.toUByte(),
                6.toUShort(),
                7.toUInt(),
                8UL,
                'G'.code.toInt()
            )
        )

        println("\n-- Testing records")
        println(Iface.testRecord(Iface.Ab("0", "11")))

        println("\n-- Testing lists")
        println(Iface.test2(listOf("ab", "cd", null, "ef")))

        println("\n-- Testing options")
        println(Iface.test3(Option.None))
        println(Iface.test3(Option.Some(Option.None)))
        println(Iface.test3(Option.Some(Option.Some(null))))
        println(Iface.test3(Option.Some(Option.Some(1000))))

        println("\n-- Testing result")
        println(Iface.testResult(true))
        println(Iface.testResult(false))

        println("\n-- Testing tuple")
        println(Iface.testTuple(true, Pair(false, "S1"), Triple(true, "S2", 50)))

        println("\n-- Testing variant")
        println(Iface.testVariant(Iface.V.A(10)))
        println(Iface.testVariant(Iface.V.B(10f)))

        println("\n-- Testing enum")
        println(Iface.testEnum(Iface.Color.HOT_PINK))
        println(Iface.testEnum(Iface.Color.LIME_GREEN))
        println(Iface.testEnum(Iface.Color.NAVY_BLUE))

        println("\n-- Testing flags")
        println(Iface.testFlags(Iface.Fg(true, true, true, true)))
        println(Iface.testFlags(Iface.Fg(true, false, true, false)))
        println(Iface.testFlags(Iface.Fg(false, false, true, true)))

        println("\n-- Testing resources")
        Jsiface.X(10).use { x ->
            Jsiface.X.add(x, 20).use { x2 ->
                println(x2.getA())
                x2.setA(300)
                println(x2.getA())
            }
        }

        println("\n-- Testing WASI Preview 2")
        testWASI()
        println("\n-- iface exports testing done")
        println("--------------------------------\n\n")
    }

    class TestExportedResourceImpl(var a: Int) : TestExports.TestExportedResource() {
        override fun getA(): Int = a
        override fun setA(a: Int) {
            this.a = a
        }

        companion object : Statics {
            override fun add(x: TestExportedResourceImpl, a: Int): TestExportedResourceImpl =
                TestExportedResourceImpl(x.a + a)
        }
    }
}

fun testWASI() {
    println("Environment.getEnvironment: ${Environment.getEnvironment()}")
    println("Environment.getArguments: ${Environment.getArguments()}")
    println("Environment.initialCwd: ${Environment.initialCwd()}")

    println("Random.getRandomU64: ${Random.getRandomU64()}")
    println("Random.getRandomBytes: ${Random.getRandomBytes(10u)}")
    println("Insecure.getInsecureRandomU64: ${Insecure.getInsecureRandomU64()}")
    println("Insecure.getInsecureRandomBytes: ${Insecure.getInsecureRandomBytes(10u)}")
    println("InsecureSeed.insecureSeed: ${InsecureSeed.insecureSeed()}")

    println("MonotonicClock.now: ${MonotonicClock.now()}")
    println("MonotonicClock.resolution: ${MonotonicClock.resolution()}")
    // TODO: MonotonicClock.subscribeInstant()
    // TODO: MonotonicClock.subscribeDuration()

    println("WallClock.now: ${WallClock.now()}")
    println("WallClock.resolution: ${WallClock.resolution()}")

    WASI_020.println("Test writing to stdout via WASI 0.2 binding")
    WASI_020.printlnErr("Test writing to stderr via WASI 0.2 binding")

    println("Reading .gitignore file:\n ${WASI_020.readText(Environment.initialCwd() + "/.gitignore")}")
}

object WASI_020 {
    val stdout = Stdout.getStdout()
    val stderr = Stdout.getStdout()
    val rootDescriptor = Preopens.getDirectories().find { it.second == "/" }!!.first

    fun readText(absolutePath: String): String {
        rootDescriptor.openAt(
            pathFlags = Types.PathFlags(symlinkFollow = false),
            "./$absolutePath",
            flags = Types.DescriptorFlags(read = true, write = false),
            openFlags = Types.OpenFlags()
        ).getOrThrow().use { fd ->
            val stat = fd.stat().getOrThrow()
            val readResult = fd.read(stat.size, 0u).getOrThrow()
            return readResult.first.toUByteArray().toByteArray().decodeToString()
        }
    }

    fun println(x: Any) {
        stdout.blockingWriteAndFlush((x.toString() + "\n").encodeToByteArray().map { it.toUByte() })
    }

    fun printlnErr(x: Any) {
        stderr.blockingWriteAndFlush((x.toString() + "\n").encodeToByteArray().map { it.toUByte() })
    }
}