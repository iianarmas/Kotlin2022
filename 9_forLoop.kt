fun main() {
    val count = 10

    var sum = 0
    for (i in 1..count) {
        sum += i
        println(sum)
    }
}

// =========================
fun main() {
    var sum = 1
    var lastSum = 0
    repeat(10) {
        val temp = sum
        sum += lastSum
        lastSum = temp
    }

// =========================
 fun main() {
    var count = 10
    var sum = 0
    for (i in 1 .. count step 2){
        sum += i
        println(i)
    }
}
