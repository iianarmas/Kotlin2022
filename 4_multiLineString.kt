var bigString = """
    |You can have a string
    |that contain multiple
    |lines
    |by
    |doing this.
""".trimMargin()    //.trimIndent still adds '|' (pipe character)

fun main() {
    println(bigString)
}
