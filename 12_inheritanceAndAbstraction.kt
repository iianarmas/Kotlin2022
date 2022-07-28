abstract class Animal {             // once this is abstracted, no need to declare that it is open
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()    // no need for curly braces
    abstract fun eat()

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

    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
    }
    val vehicle = Vehicle()
    vehicle.roam()
}

fun giveShot(animal: Animal) {
    animal.hunger
    animal.makeNoise()
}

interface Roamable {
    var velocity: Int
        get() = 20
        set(value) {
            println("Unable to update velocity")
        }
    fun roam() {
        println("The Roamable is roaming.")
    }
}

class Vehicle : Roamable {
    override fun roam() {
        super<Roamable>.roam()
        println("The Vehicle is roaming.")
    }
}
