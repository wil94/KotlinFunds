package Fundaments

fun main (args: Array<String>) {
    println("Pow con Kotlin!")
    /* Variables y sus tipos */
    // char debe contener un solo caracter
    val firstLetter: Char = 'a'
    val myName: String = "Williams"

    val firstApplication: Boolean = true

    val bite: Byte = 1
    val shorter: Short = 23
    val entero: Int = 10
    val decimal: Double = 1.923
    var sumaDecimal: Double = entero + decimal
    var sumaEntera:Int = decimal.toInt() + entero
    println("La suma decimal es: $sumaDecimal")
    println("La suma entera es: $sumaEntera")


    /* Basic Arrays and While */
    // Definiendo el Tipo y Numerode elementos que contendra el array friends
    val friends: Array<String> = arrayOf("Cristian", "Roberto", "Eduardo", "Dexter", "Wil")
    // Seteando un item aunque sea el array val
    friends[1] = "Israel"
    // no trabaja porque sobrepasa la cantidad de items declarados en el array
    // friends[5] = "Daynor"
    var i = 0
    while (i < friends.size) {
        println("Amigo ${friends[i]}, posicion $i")
        i++
    }
    println("Mi array es muy ${if (friends.size > 10) "grande" else "pequeño"}")


    /* Some Functiones */
    val country = returnPais()
    val city = returnCity()
    println("Vivo en el pais de $country en la ciudad de $city")

    // Obtener el mayor y el menor
    val x = 100
    val y = 73
    println("El mayor es: ${returnMax(x, y)}")
    println("El menor es: ${returnMin(x, y)}")

    // Usando loop FOR
    playingWithFor()
}

/* Functions */
fun returnCity(): String {
    return "La Paz"
}
// Funciones cortas
// En la mayoria de las veces Kt ya conoce que tipo de dato retornara
fun returnPais() = "Bolivia"
// retornando un entero
fun returnMax(x: Int, y: Int) = if (x > y) x else y
// Declarando que retorna un entero
fun returnMin(x: Int, y: Int): Int = if (x < y) x else y


fun playingWithFor() {
    // Recorriendo del 1 al 10
    for (i in 1..10) {
        print("$i ")
    }
    // Sintaxis corta for, 1 al 9
    for (j in 1 until 10) print("$j ")
    // Bajando de 10 al 1
    for (k in 10 downTo 1) print("$k  ")
    // Dando pasos grandes de 3 en 3
    for (l in 1..20 step 3) print("$l ")
    println()

    // Recorriendo Array
    val friends: Array<String> = arrayOf("Cristian", "Roberto", "Eduardo", "Dexter", "Wil")
    for (friend in friends) {
        print("Amigo $friend ")
    }
    println()
    // accediendo al indice recorrido
    for (indice in friends.indices) {
        println("Indice $indice contiene a ${friends[indice]} ")
    }
    // Accediendo al item y al indice
    for ((indice, item) in friends.withIndex()) {
        println("$item esta en la posicion: $indice")
    }
}
