package PooAndPolymorfism

// Las interfaces no pueden heredar
// Las interfaces no tienen constructor
// Las interfaces no pueden ser instanciadas
interface Roaming {
    /* Cuando una funcion no tiene cuerpo {} se asume que es una funcion abstracta
    * por lo tanto debe estar sobrescrita donde se la implemente*/
    fun roam()

    // Esta puede estar o no sobrescrita en donde se la implemente
    fun anotherRoam() {

    }
}