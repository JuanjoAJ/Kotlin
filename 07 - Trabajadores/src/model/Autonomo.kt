package model

class Autonomo : Trabajador {
    private var cuotaSS: Double
    constructor(nombre: String, apellido: String, dni: String, sueldo: Double, cuotaSS: Double, contratado: Boolean) : super(
        nombre,
        apellido,
        dni,
        sueldo,
        contratado
    ){
        this.cuotaSS = cuotaSS
    }

    override fun calcularSalario() = (sueldoAnual-(12*cuotaSS))/12

    override fun toString(): String {
        return "Autonomo: "+super.toString()
    }

    override fun mostrarDatos() {
        println(" Autonomo: ")
        super.mostrarDatos()
    }
}