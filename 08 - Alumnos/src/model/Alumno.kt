package model

class Alumno(
    private val id:Int,
    private var nombre: String,
    private var apellido: String,
    private var telefono: String? = null,
    private var correo: String? = null,
    private var calificacion: Double = 0.0,
    private var matriculado: Boolean = true
) {

    fun mostrarDatos() {
        println("id = $id")
        println("nombre = $nombre")
        println("apellido = ${apellido}")
        println("telefono = ${telefono ?: "Dato no disponible"}")
        println("correo = ${correo ?: "Dato no disponible"}")
        println("calificacion = $calificacion")
        println("matriculado = $matriculado")
    }

    fun desmatricular() {
        matriculado = false
    }

    fun calificar(nota: Double) {
        calificacion += nota
    }

    fun getId():Int{
        return id
    }
    fun isMatricula():Boolean {
    return matriculado
    }
}

