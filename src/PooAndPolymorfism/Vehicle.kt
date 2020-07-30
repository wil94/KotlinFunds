package PooAndPolymorfism

open class Transport {

}

/*
* Una clase puede heredar y puede implementar N interfaces
* Una clase puede implementar N interfaces
* */
class Vehicle : Transport(), Roaming, stoping, starting {
    // sobrescribimos esta funcion que se esta implementando de Roaming, ya que es abstracta
    override fun roam() {
        println("The vehicle is roaming")
    }

    override fun start() {
        println("The vehicle is starting")
    }
}

interface conPropiedades {
    /*
    * Esta es la unica manera de declarae variables en la interface,
    * y se considera abstracta y debe estar sobrescrito en donde se implemente
    * a esta interface.
    * Puede retornar valores por get pero no se le puede dar un valor inicial.
    * Tiene set pero no Field por lo cual no se puede setar esta propiedad
    * */
    val myProperty: String
    get() = "String de interface conPropiedades"
}

interface stoping {
    fun stop() {
        println("The vehicle is stoping")
    }
}

interface starting {
    fun start()
}