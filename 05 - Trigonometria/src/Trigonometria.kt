import kotlin.math.pow

class Circulo(var radio: Double) : Figura() {

    override fun calcularArea() = Math.PI * radio.pow(2)
    fun calcularDiametro() = 2 * radio
    override fun toString(): String = "círculo"
}

class Rectangulo(var base: Double, var altura: Double) : Figura() {
    override fun calcularArea() = base * altura
    fun calcularPerimetro() = 2 * (base + altura)
    override fun toString(): String = "rectángulo"
}

class Triangulo(var base: Double, var altura: Double) : Figura() {
    override fun calcularArea() = (base * altura) / 2
    override fun toString(): String = "triángulo"
}

abstract class Figura {
    abstract fun calcularArea(): Double
}

class Trigonometria {
    var figuras: ArrayList<Figura>

    constructor() {
        figuras = ArrayList()
    }

    constructor(figuras: ArrayList<Figura>) {
        this.figuras = figuras
    }

    fun añadirFigura(figura: Figura) = figuras.add(figura)
    fun mostrarAreas() {
        if (figuras.isNotEmpty()) {
            figuras.forEach { item ->
                println("El area del $item es ${item.calcularArea()}")
            }
        }
    }
    fun mostrarDiametro(){
        if (figuras.isNotEmpty()) {
            figuras.forEach { item ->
                if (item is Circulo)
                println("El diametro del $item es ${item.calcularDiametro()}")
            }
        }
    }

    fun mostrarPerimetro(){
        if (figuras.isNotEmpty()) {
            figuras.forEach { item ->
                if (item is Rectangulo)
                    println("El diametro del $item es ${item.calcularPerimetro()}")
            }
        }
    }

}

fun main() {
    var trigonometria: Trigonometria = Trigonometria()
    var rectangulo = Rectangulo(2.0, 3.0)
    var circulo = Circulo(2.1)
    var triangulo=Triangulo(5.2, 2.6)

    trigonometria.añadirFigura(rectangulo)
    trigonometria.añadirFigura(circulo)
    trigonometria.añadirFigura(triangulo)

    trigonometria.mostrarAreas()
    trigonometria.mostrarPerimetro()
    trigonometria.mostrarDiametro()
}