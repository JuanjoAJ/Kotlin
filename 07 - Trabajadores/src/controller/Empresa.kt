package controller

import model.Asalariado
import model.Autonomo
import model.Jefe
import model.Trabajador

import kotlin.collections.ArrayList

class Empresa() {
    private var trabajadores = ArrayList<Trabajador>()

    constructor(trabajores: ArrayList<Trabajador>) : this() {
        this.trabajadores = trabajores
    }

    fun listarTrabajadores(opcion: String) {
        when (opcion.lowercase()) {
            "1","jefe" -> trabajadores.forEach { item -> if (item is Jefe) item.mostrarDatos() }
            "2","asalariado" -> trabajadores.forEach { item -> if (item is Asalariado) item.mostrarDatos() }
            "3","autónomo", "autonomo" -> trabajadores.forEach { item -> if (item is Autonomo) item.mostrarDatos() }
            else -> println("Opción no reconocida")
        }
    }

    fun listarTrabajador(dni: String) = trabajadores.find { it.cogertDni().equals(dni, ignoreCase = true) }?.mostrarDatos()
        ?: println("No hay trabajadores asociados a ese DNI")

    fun despedirTrabajador(dniJefe: String, dniEmpleado: String) {
        val jefe = trabajadores.find { it.cogertDni().equals(dniJefe, ignoreCase = true) }
        if (jefe is Jefe) {
            trabajadores.find { it.cogertDni().equals(dniEmpleado, ignoreCase = true) }?.let {
                jefe.despedirEmpleado(it)
                println("El empleado ya no forma parte de la empresa")}

        } else println("El DNI no es de un jefe")
    }

    fun registrarTrabajador(trabajador: Trabajador) {
        if (trabajadores.find { it.cogertDni().equals(trabajador.cogertDni(), ignoreCase = true) } == null) {
            trabajadores.add(trabajador)
            println("Trabajador agregado con éxito")
        } else {
            println("Ya hay alguien con ese dni registrado")
        }
    }

    fun isJefe(): Boolean {
        trabajadores.forEach { item ->
           if (item is Jefe) return true
        }
    return false
    }

}