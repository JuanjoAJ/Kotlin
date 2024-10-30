import controller.Colegio
import model.Alumno

fun main() {
        var colegio= Colegio()
        var alumno= Alumno(1, "Juanjo", "Avila")
        colegio.agregarAlumno(alumno)
        colegio.agregarAlumno(Alumno(2, "Borja", "Martin"))
        colegio.agregarAlumno(alumno)

        colegio.listarAlumno()

    }