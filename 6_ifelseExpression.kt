const val animal: String = "Fox"

fun main() {
    if (animal == "Cat" || animal == "Dog"){
        println("This animal is a House Pet.")
    } else {
        println("This animal is not a House Pet.")
    }

}

=================================
var a = 12
var b = 10

fun main() {
    var min: Int
    min = if (a < b) {
        a
    } else {
        b
    }
    println(min)
}
