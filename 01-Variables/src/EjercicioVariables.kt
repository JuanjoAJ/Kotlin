/*
1. Declara una variable llamada "nombre" de tipo String y asígnale tu nombre.
2. Declara una variable llamada "edad" de tipo Int y asígnale tu edad.
3. Declara una variable llamada "altura" de tipo Double y asígnale tu altura en metros.
4. Declara una variable llamada "esMayorDeEdad" de tipo Boolean y asígnale true si eres mayor de edad o false si no lo eres.
5. Declara una variable llamada "listaDeNombres" de tipo List<String> y asígnale una lista con los nombres de tus tres mejores amigos.
6. Declara una variable llamada "numeroDeMes" de tipo Int y asígnale un valor entre 1 y 12 que represente un mes del año.
7. Declara una variable llamada "temperatura" de tipo Float y asígnale una temperatura en grados Celsius.
8. Declara una variable llamada "esFinDeSemana" de tipo Boolean y asígnale true si hoy es sábado o domingo, o false si es cualquier otro día de la semana.
9. Declara una variable llamada "precio" de tipo Double y asígnale el precio de tu comida favorita en un restaurante.
10. Declara una variable llamada "nombreCompleto" de tipo String y asígnale tu nombre completo.*/


var nombre: String = "Juanjo"
var edad: Int = 31
var altura: Double = 1.76
var esMayorDeEdad: (Int) -> Boolean = { inputEdad: Int ->
    inputEdad >= 18
}
var listaDeNombres: List<String> = listOf("Kriss", "Teyi", "Rafa")
var numeroDeMes: (Int) -> Int? = { numMes: Int ->
    if (numMes in 1..12) numMes
    else null
}
var temperatura: Float = 20.3F
var esFinDeSemana: (String) -> Boolean = { dia: String ->
    dia.equals("sabado", ignoreCase = true) || dia.equals("domingo", ignoreCase = true)
}
var precio: Double = 20.50
var nombreCompleto:String?=null


fun main() {
    println(
        "Hola ${nombre}, tiene ${edad} años y es ${esMayorDeEdad(edad)} que eres mayor de edad," +
                "tu altura es de $altura metros. Además estos son tres de tus mejores amigos $listaDeNombres " +
                "y tu plato favorito cuesta ${precio}"
    )
    println("El mes sería ${numeroDeMes(3)} pero nunca ${numeroDeMes(20)}")
    println("La temperatura es de $temperatura ºC")
    println("¿Qué día es hoy?")
    println("Entonces hoy es ${esFinDeSemana(readln())} que es fin de semana")
    println("Por favor indica tu nombre completo")
    nombreCompleto= readlnOrNull()
    println(nombreCompleto?:"No has asignado nombre")
}