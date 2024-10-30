package model

abstract class Trabajador(var nombre: String, var apellido: String, var dni: String, var sueldoAnual: Double) {
    private var contratado: Boolean? = null

    constructor(nombre: String, apellido: String, dni: String, sueldo: Double, contratado: Boolean) : this(
        nombre,
        apellido,
        dni,
        sueldo
    ) {
        this.contratado = contratado
    }

    abstract fun calcularSalario(): Double
    open fun mostrarDatos() {
        println("nombre = ${nombre}")
        println("apellido = ${apellido}")
        println("dni = ${dni}")
        println("salario anual = ${sueldoAnual}")
    }

    override fun toString(): String {
        return "Nombre: $nombre Apellido: $apellido DNI: $dni Salario Anual: $sueldoAnual"
    }

    open fun cogertDni() = this.dni

    open fun isContratado() = this.contratado

    open fun setContratado(contrato: Boolean) {
        this.contratado = contrato
    }


}





