//1. Crea un array de Strings con los nombres de 5 compañeros. A continuación, recorre el array y escribe el nombre de cada persona en la consola.
val names: Array<String> = arrayOf("Lidia", "Gabriel", "Carol", "Edu", "Javier")
fun namePrint(names: Array<String>) {
    names.forEach { item -> println(item) }
}

//2. Crea un array de enteros con la serie de Fibonacci de los primeros 20 números. A continuación, recorre el array y escribe cada número en la consola.
fun fibonacci(num: Int=20): Int {
    if (num < 2) {
        return num
    } else {
        return fibonacci(num - 1) + fibonacci(num - 2)
    }
}
val fibonacciArray=IntArray(20){i -> fibonacci(i)}


//3. Crea un array de enteros con los números del 1 al 10.
//A continuación, utiliza `filter` para obtener sólo los números impares.
val numTen = Array(10) { (it + 1) }
fun filter(num: Array<Int>) {
    num.filter { it % 2 != 0 }.forEach { println(it) }
}

//4. Crea un array de Strings con los nombres de tus profesores de la universidad.
// A continuación, utiliza `find` para obtener el primer nombre que contenga la letra 'a'.
var nameTeacher = arrayOf("Borja", "Javier", "Victor", "Jose", "Cesar")
fun find(nameArray: Array<String>) {
    val result = nameArray.find { it.contains('a') }
    println(result)
}

//5. Crea un array de enteros con los números del 1 al 5.
// A continuación, utiliza `map` para multiplicar cada número por 2.
var numInt = intArrayOf(1, 2, 3, 4, 5)
var result = numInt.map { it * 2 }

//6. Crea un array de enteros con los números del 1 al 10.
// A continuación, utiliza `reduce` para obtener la suma de todos los números.
var reduce = numTen.reduce { item, num -> item + num }

//7. Crea un array de Strings con los nombres de tus 5 películas favoritas.
// A continuación, utiliza `joinToString` para unir los nombres en una sola cadena, separados por comas.

var listPelis = listOf("The Goodfather", "Empire Strike Back", "Dark Crystal", "All about Eve", "Silence of the lambs")
var uniqueList = listPelis.joinToString { it }

//8. Crea un array de enteros con los números del 1 al 5.
// A continuación, utiliza `sortedDescending` para ordenar los números de forma descendente.
var numFive = Array(5) { it + 1 }
fun sortDes(numFive: Array<Int>) {
    numFive.sortByDescending { it }
    println(numFive.joinToString { "$it" })
}

//9. Crea un array de enteros con los números del 1 al 10.
// A continuación, utiliza `slice` para obtener los elementos de la posición 2 a la posición 6.
var numSlice = numTen.slice(1..5)

//10. Crea un array de enteros con los números del 1 al 5.
// A continuación, utiliza`all` para comprobar si todos los números son menores que 10.
var lessTen = numFive.all { it < 10 }


fun main() {
    println(fibonacciArray.joinToString { "$it" })

}
