var pairs = 3.0 to 4.5

fun main() {
    println(pairs)
    println(pairs.first)
    println(pairs.second + 5)

    //destructuring declaration
    val (x, y) = pairs
    println(x)
    
    /* use underscore to ignore certain parts
        /x, y, _)
     */
}
