package PooAndPolymorfism

fun main(args: Array<String>) {
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

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        /* Cuando este recorriendo Vehicle() ejecutara el roam() de la
        * SU contexto que viene desde la interface que esta implementando,
        * es decir, Roaming */
        item.roam()
        // Validando si item es del tipo Animal
        if (item is Animal) {
            /* Cuando este recorriendo Vehicle() no ejeuctara este codigo,
            * ya que estamos validando si Vehicle es del tipo Animal, lo cual,
            * es false, por lo tanto, NO ejecutara eat() para este item */
            item.eat()
        }
    }
}

// Las clases abastractas no dejan que se hagan instancias de las mismas
// Las clases abstractas pueden tener propiedades y funciones abstractas y concretas
// Las clases concretas NO pueden tener propiedades y funciones abstractas
// Esta clase esta implementando la interface Roaming por eso no lleva () como al heredar
abstract class Animal : Roaming {
    // Las propiedades abstractas no tienen un get o set manejables
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    val hunger = 10

    // Las funciones abstractas no tienen cuerpo {}
    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}

/* Cuando una CLASE hereda de una Superclase abstracta y ésta no
*  tiene subclases que sobrescriban las propiedades y funciones
*  abstractas de su superclase, se debe sobresciribir dichas propiedades,
*  y funciones en esta CLASE, caso contrario no compilara.
* */
class Hippo: Animal() {
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

/* Esta clase hereda a otra y en esa CLASE se sobrescriben las
* propiedades y funciones de la superclase abstracta, por ello
* no da ningun error.
*  */
abstract class Canine: Animal() {
    override fun roam() {
        println("The canine is roaming")
    }
}

// Esta clase sobrescribe las propiedades y funciones de su superclase abstracta
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