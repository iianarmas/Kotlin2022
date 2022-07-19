var hoursWorked = 45

fun main() {
    var price = 0
    if (hoursWorked > 40) {
        val hoursOver40 = hoursWorked - 40
        price += hoursOver40 * 50
        hoursWorked -= hoursOver40
        price += hoursWorked * 25
        println(price)
    } else {
        price += hoursWorked * 25
        println(price)
    }
}
