package PooAndInheritance

fun main(args: Array<String>) {
    // Creando un array de tipo PooAndInheritance.Animal()
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}

// Open class convierte a una clase en super clase, haciendo que subclases puedan heredar de esta
// Open atributo/metodo vuelve a estas mutables cuando subclases las usen
open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The PooAndInheritance.Animal is making a noise")
    }

    open fun eat() {
        println("The PooAndInheritance.Animal is eating")
    }

    open fun roam() {
        println("The PooAndInheritance.Animal is roaming")
    }

    fun sleep() {
        println("The PooAndInheritance.Animal is sleeping")
    }
}

// : PooAndInheritance.Animal(), heredara de Superclase PooAndInheritance.Animal
class Hippo : Animal() {
    // override sobrescribe el valor de la propiedad o metodo de la superclase
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise()  {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }
}

open class Canine: Animal() {
    override fun roam() {
        println("The canine is roaming")
    }
}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise()  {
        println("Hoooooooow!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}

class Vet {
    // Funciones pueden recibir objetos
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}