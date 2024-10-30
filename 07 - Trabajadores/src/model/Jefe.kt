package model

class Jefe : Trabajador {
    private var acciones: Double
    private var beneficio: Double

    constructor(
        nombre: String,
        apellido: String,
        dni: String,
        acciones: Double,
        beneficio: Double,
        sueldo: Double
    ) : super(nombre, apellido, dni, sueldo) {
        this.acciones = acciones
        this.beneficio = beneficio

    }

    override fun calcularSalario() = sueldoAnual / 12

    override fun mostrarDatos() {
        println("Mostrando los datos de Jefe: ")
        super.mostrarDatos()
        println("acciones = ${acciones}")
        println("beneficio = ${beneficio}")
    }

    override fun toString(): String {
        return "Jefe:  ${super.toString()} Acciones: $acciones Beneficio: $beneficio"
    }

    fun despedirEmpleado(trabajador: Trabajador){
        if (trabajador.isContratado() == true) trabajador.setContratado(false)
    }

}