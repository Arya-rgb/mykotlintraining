// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println("""
        $stringResult
        $intResult
    """.trimIndent())
}

// TODO 1
fun <T> getResult(args: T): Int {
    return when (args) {
        is String -> args.length
        is Int -> args * 5
        else -> 0
        }
    }
