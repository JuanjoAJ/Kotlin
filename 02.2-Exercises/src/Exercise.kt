import kotlin.math.PI
import kotlin.math.pow

/*1. Escribe un programa que pida al usuario dos números enteros y calcule su suma.
2. Escribe un programa que pida el radio de un círculo y calcule su área. Utiliza la fórmula Área = π * radio^2.
3. Escribe un programa que convierta grados Celsius a Fahrenheit. Usa la fórmula: F = C * 9/5 + 32.
4. Escribe un programa que lea un número entero y determine si es par o impar (el if es igual que en Java)
5. Escribe un programa que lea dos números enteros y determine cuál es mayor.
6. Escribe un programa que calcule el factorial de un número ingresado por el usuario.
7. Escribe un programa que simule una calculadora básica. El programa debe pedir al usuario dos números
y una operación (suma, resta, multiplicación, división) y mostrar el resultado.
8. Escribe un programa que determine si un número ingresado por el usuario es primo
9. Escribe un programa que maneje información de usuarios, donde algunos campos pueden ser opcionales
(es decir, pueden ser null). En el programa, ni el apellido ni la edad pueden ser null.
Si no se proporciona la edad, debes manejar un valor por defecto.
Crear una función que reciba el nombre, apellido y edad y devuelva un mensaje con la información completa del usuario.
 Maneja de forma segura los posibles nulos*/

//1
fun suma(num1: Int, num2: Int): Int {
    return num1 + num2
}

//2
fun areaCirculo(radio: Double): Double {
    return PI * radio.pow(2)
}

//3
fun cambioFarenh(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}

//4
fun parImpar(num: Int) {
    if (num % 2 == 0) println("Es par") else println("Es impar")
}

//5
fun esMayor(num1: Int, num2: Int) {
    if (num1 > num2) println("El $num1 es el mayor") else if (num2 > num1) println("El $num2 es el mayor")
    else println("Ambos números son iguales")
}

//6
fun factorial(num: Int): Int {
    var aux: Int = num
    for (i in 1..<num) {
        aux *= i
    }
    return aux
}

//7
fun calculadoraBasica(num1: Int, num2: Int, op: String): Double? {
    when (op) {
        in "suma" -> {
            return (num1 + num2).toDouble()
        }

        in "resta" -> {
            return (num1 - num2).toDouble()
        }

        in "multiplicacion" -> {
            return (num1 * num2).toDouble()
        }

        in "division" -> {
            if (num1 == 0 || num2 == 0) return null else return (num1 / num2).toDouble()
        }

        else -> return null
    }
}

//8
fun esPrimo(num: Int) {
    if (num <= 1) {
        println("No es primo")
    } else {
        for (i in 2..<num) {
            if (num % i == 0) {
                return println("Es primo")
            }
        }
        return println("No es primo")
    }
}

//9
fun usuario(nombre: String?, apellido: String, edad: Int=30) {
    println("Buenos días ${nombre ?: "Sr/Sra."} $apellido, tienes $edad años")
}
