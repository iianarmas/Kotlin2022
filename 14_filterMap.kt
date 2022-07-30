

fun main(args: Array<String>) {
    val lst = mutableListOf<Int>(6, 5, 3, 8, 4, 10, 13)

    val evn = lst.filter { it % 2 == 0 }
    val dbl = evn.map { it * 2 }

    evn.forEach { println(it) }
    dbl.forEach { println(it) }
}
