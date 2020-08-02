fun main(args: Array<String>) {
    /* Exercise FizzBuzz
    for (x in 1..20) {
        println(fizzBuzzing(x))
    }
    */

    /* Exercise Anagrams
    val wordOne = "dairy"
    val wordTwo = "diary"
    println("Los textos $wordOne y $wordTwo son anagramas?: ${isAnagram(wordOne, wordTwo)}")
    */

    /* Exercise Count Vowels
    val contarVocales = "Murcielago"
    println("La palabra $contarVocales tiene ${countVowels(contarVocales)} vocales")
    */

    /* Exercise word palindrome
    val wordPalindrome = ""
    println("La palabra $wordPalindrome es palindroma: ${wordPalindrome(wordPalindrome)}")
    */

    val sintaxisCorrecta = "{[(M)]}"
    println("La sintaxis  $sintaxisCorrecta  es correcta?: ${isCorrectSintax(sintaxisCorrecta)}")
}

// Funcion que muestra Fizz si es divisible entre 3 o Buzz si es entre 5...
fun fizzBuzzing(x: Int): String {
    if (x % 3 == 0 && x % 5 == 0) return "FizzBuzz"
    else if (x % 3 == 0) return "Fizz"
    else if (x % 5 == 0) return "Buzz"
    else return "$x"
}

// Funcion que Analiza si dos palabras hacen un anagrama
fun isAnagram(parOne: String, parTwo: String) : Boolean {
    var wordOne = parOne.trim().toUpperCase()
    var wordTwo = parTwo.trim().toUpperCase()
    if (wordOne == wordTwo) return false
    if (wordOne.length != wordTwo.length) return false
    else {
        var i = 1
        val sptWordOne = wordOne.split("")
        val sptWordTwo = wordTwo.split("")
        while (i < sptWordOne.size - 1) {
            if (!(sptWordOne[i] in sptWordTwo)) return false
            i++
        }
        return true
    }
}

// Funcion que cuenta las vocales en una palabra
fun countVowels(word: String) : Int {
    val sptWord = word.trim().toUpperCase().split("")
    val vowels = arrayOf("A", "E", "I", "O", "U")
    var i = 1
    var numVowels = 0
    while (i < sptWord.size - 1) {
        if (sptWord[i] in vowels) numVowels++
        i++
    }
    return numVowels
}

/*
* Funcion que retorna si una palabra es palidroma, es decir,
* si se lee igual al reves SIN usar reversed()
* */
fun wordPalindrome(word: String) : Boolean {
    if (word.length > 1) {
        val sptWord = word.trim().split("")
        var wordReversed = ""
        var i = 1
        var r = sptWord.size - 2
        while (i < sptWord.size - 1) {
            wordReversed += sptWord[r]
            r--
            i++
        }
        println("$word ----- $wordReversed")
        return (word == wordReversed)
    } else return true
}


fun isCorrectSintax(str: String) : Boolean {
    val openBraces = arrayOf("[", "{", "(")
    val closeBraces = arrayOf("]", "}", ")")
    var flag = true

    val sptStr = str.trim().split("")
    var i = 1
    var lastOpen = ""
    var nextClose = ""
    var storeOpenBraces = mutableListOf("String()")
    storeOpenBraces.add("SSSS")
    storeOpenBraces.add("RRRRRR")

    val ss = object {
        var sss: String = ""
    }


//    storeOpenBraces.plus("S")
//    storeOpenBraces.plus("w")
    println(storeOpenBraces[0])
    //println(storeOpenBraces[1])
    //println(storeOpenBraces[2])


    while (i < sptStr.size - 1) {


        if (sptStr[i] in openBraces) {
            lastOpen = sptStr[i]
            nextClose  = handleBraces(lastOpen)
        }
        println(sptStr[i] + " - " + lastOpen + " - " + nextClose)
        if (sptStr[i] in closeBraces && sptStr[i] != nextClose) return false
        i++
    }
    return true
}

fun handleBraces(b: String) : String {
    var ret = ""
    if (b.equals("(")) ret = ")"
    if (b == "[") ret = "]"
    if (b == "{") ret = "}"
    return ret
}