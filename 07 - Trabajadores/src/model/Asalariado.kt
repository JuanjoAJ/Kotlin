package model

class Asalariado : Trabajador {
    private var nPagas: Int

    constructor(
        nombre: String,
        apellido: String,
        dni: String,
        sueldo: Double,
        nPagas: Int,
        contratado: Boolean
    ) : super(nombre, apellido, dni, sueldo, contratado) {
        this.nPagas = nPagas

    }

    override fun calcularSalario(): Double = (sueldoAnual * 0.79) / nPagas

    override fun mostrarDatos() {
        println("Mostrando datos de asalariado: ")
        super.mostrarDatos()
        println("sueldo = ${sueldoAnual/nPagas}")
        println("nPagas = ${nPagas}")
    }

    override fun toString(): String {
        return "Alariado: ${super.toString()} Salario Mensual: ${sueldoAnual/nPagas} Número de Pagas: $nPagas"
    }

}