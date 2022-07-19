val hourOfDay = 12

fun main() {
    val timeOfDay = if (hourOfDay < 6) {
        "Early Morning"
    } else if (hourOfDay < 12) {
        "Morning"
    } else if (hourOfDay < 17) {
        "Afternoon"
    } else if (hourOfDay < 20) {
        "Evening"
    } else if (hourOfDay < 24) {
        "Late Evening"
    } else {
        "INVALID TIME"
    }
    println(timeOfDay)
}
