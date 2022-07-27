abstract class Animal {             // once this is abstracted, no need to declare that it is open
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The Animal is making a noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}

class Hippo: Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

abstract class Canine: Animal() {
    override fun roam() {
        println("The Canine is Roaming")
    }
}

class Wolf: Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooooowl!")
    }
    override fun eat() {
        println("The Wolf is eating $food")
    }
}


fun main() {
    val myWolf = Wolf()
    println(myWolf.hunger)
    myWolf.roam()
    myWolf.sleep()

    //val animal = Animal()   -- cannot create instance of an abstract class
    giveShot(myWolf)

}

fun giveShot(animal: Animal) {
    animal.hunger
    animal.makeNoise()
}