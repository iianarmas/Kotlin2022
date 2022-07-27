// called after the constructor
// called whenever object is inintialized

class Dogs(var name: String, var bark: String) {
    init {
        println("Dog $name barks like $bark!")
    }
    fun play(activity: String) {
        println("This dog likes to $activity.")
    }
}

fun main() {
    var myDog = Dogs("Beavalou", "Woof")    // --> point of initialization
    myDog.play("Jump")

}
