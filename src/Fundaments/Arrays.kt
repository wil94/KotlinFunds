package Fundaments

fun main(args: Array<String>) {
    // Declarando arrays de distintos tipos
    val myBools = ArrayList<Boolean>()
    val myInts = ArrayList<Int>()
    val myDoubles = ArrayList<Double>()
    val myStrings = ArrayList<String>()
    val people = ArrayList<Persona>()

    // Adicionando items a los array de distintos tipos de ARRAY
    for (i in 1..10) {
        // Adicionar true
        if (i % 2 == 0) myBools.add(true) else myBools.add(false)
        myInts.add(i)
        myDoubles.add(1000.00)
        myStrings.add("CLI-${if (i % 2 == 0) "PAR" else "IMPAR"}-00$i")
    }

    // Adicionando al array de PERSONA con los anteriores arrays
    for (ind in myStrings.indices) {
        people.add(Persona(myStrings[ind], myInts[ind], myDoubles[ind], myBools[ind]))
    }

    // Mostrando los datos de todos los arrays en base a PEOPLE
    people.forEach {
        println("id: ${it.id} | numero: ${it.numCLiente} | pago: ${it.pago} Bs. | par: ${it.clientePar}")
    }

    println("----------------------------------------------------")

    // Ordenando el array personas por el id alfabeticamente
    var porNombre = people.sortBy { it.id }
    people.forEach {
        println("id: ${it.id} | numero: ${it.numCLiente} | pago: ${it.pago} Bs. | par: ${it.clientePar}")
    }

    // Quitando el elemento [2] de personas
    println("----------------------------------------------------")
    people.removeAt(2)
    people.forEach {
        println("id: ${it.id} | numero: ${it.numCLiente} | pago: ${it.pago} Bs. | par: ${it.clientePar}")
    }
}

// Clase base en las que se crearan los objetos persona
class Persona(val id: String,
              val numCLiente: Int,
              val pago: Double,
              val clientePar: Boolean) {
}