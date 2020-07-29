package DataClasses

class Dog(val name: String,
          var weight_param: Int,
          val breed_param: String) {

    // Se ejecuta despues del constructor
    init {
        print("Dog $name has been created. ")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    // Se ejecuta despues de estas declaraciones de variables
    init {
        println("The breed is $breed.")
    }

    // primero le asignamos lo que le mandemos al constructor
    var weight = weight_param
    // Cuando cambiamos el valor despues de enviarle algun valor en el constructor
    set(value) {
        if (value > 0) field = value
    }

    val weightInKgs: Double
    get() = weight / 2.2

    fun bark() {
        println(if (weight > 19) "Woof!" else "Yiip")
    }
}