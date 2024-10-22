import kotlin.math.pow

//1. Crea una función que sume dos números enteros y retorne el resultado.
fun sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

fun sum2(arg: Int, arg2: Int) = println("La suma de $arg y $arg2 es de ${arg + arg2}")

var sum3 = { arg: Int, arg2: Int -> arg + arg2 }

//2. Crea una función que tome una lista de números enteros y retorne el número máximo de la lista.
var max = { numbers: ArrayList<Int> ->
    var aux = 0; for (i in 1 until numbers.size) {
    if (numbers[i] > aux) {
        aux = numbers[i]
    }
}
    aux
}

var max2 = { numbers: ArrayList<Int> -> numbers.maxOrNull() ?: 0 }

//3. Crea una función que tome un número entero y retorne verdadero si es par y falso si es impar.
fun oddEven(num: Int): Boolean {
    return num % 2 == 0
}

//4. Crea una función que tome una cadena y retorne el número de caracteres que tiene.
var numChar: (String) -> Int = { string: String ->
    var aux: Int = 0
    for (i in 0 until string.length) {
        aux++
    }
    aux
}

//5. Crea una función que tome una lista de cadenas y retorne una cadena que contenga todas las cadenas de la lista separadas por espacios.
var listToString: (ArrayList<String>) -> String = { stringArrayList: ArrayList<String> ->
    var aux: String = ""
    stringArrayList.forEach { item -> aux += (item + " ") }
    aux
}

//6. Crea una función que tome un número entero y que retorne una lista de los números enteros desde 1 hasta el número ingresado.
var numList: (Int) -> ArrayList<Int> = { num: Int ->
    var list: ArrayList<Int> = ArrayList<Int>()
    for (i in 1..num) {
        list.add(i)
    }
    list
}

//7. Crea una función que tome una lista de números enteros y que retorne una lista que contenga el cuadrado de cada número en la lista.
var squareList: (ArrayList<Int>) -> ArrayList<Int> = { numList: ArrayList<Int> ->
    var auxList: ArrayList<Int> = ArrayList<Int>()
    for (i in 0 until numList.size) {
        auxList.add(numList[i].toDouble().pow(2).toInt())
    }
    auxList
}

//8. Crea una función que tome una lista de números enteros y que retorne la suma de todos los números en la lista.
var sumLista: (ArrayList<Int>) -> Int = { numList: ArrayList<Int> ->
    var aux: Int = 0
    numList.forEach { item ->
        aux += item
    }
    aux
}

//9. Crea una función que tome una lista de cadenas y que retorne una lista de las cadenas que contengan la letra "a".
var listA: (ArrayList<String>) -> ArrayList<String> = { strings: ArrayList<String> ->
    var auxList: ArrayList<String> = ArrayList<String>()
    strings.forEach { item -> if (item.contains('a')) auxList.add(item) }
    auxList
}

//10. Crea una función que tome una lista de números enteros y que retorne el número menor de la lista.
var min = { numbers: ArrayList<Int> -> numbers.minOrNull() ?: 0 }

fun main() {

}