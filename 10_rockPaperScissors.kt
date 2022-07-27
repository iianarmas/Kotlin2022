import java.util.*

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)

    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        print("Please enter one of the following:")
        for ((index, item) in optionsParam.withIndex()) print(" $item")
        println(".")

        val userInput = readLine()
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice


}
fun printResult(userChoice: String, gameChoice: String) {
    val result: String

    result = if(userChoice == gameChoice) "Tie"
    else if (userChoice == "Rock" && gameChoice == "Scissors" ||
        userChoice =="Paper" && gameChoice == "Rock" ||
        userChoice == "Scissors" && gameChoice == "Paper") "You win!"
    else "You lose!"
    println("You chose $userChoice, computer chose $gameChoice. Result: $result")
}
