package controller

import model.Alumno

class Colegio() {
    private var listado= ArrayList<Alumno>()
    constructor(listado: ArrayList<Alumno>) : this() {
        this.listado = listado
    }

    fun agregarAlumno(alumno: Alumno) {
        if (listado.find { alumno.getId()==it.getId() }==null){
            listado.add(alumno)

        }else{
            println("Ya hay un alumno con ese id")
        }

    }


    fun calificarAlumno(id:Int, nota:Double){
        listado.forEach { item -> if(item.getId()==id) item.calificar(nota) }
    }

    fun listarAlumno(){
    listado.filter { item -> item.isMatricula() }.forEach{ it.mostrarDatos() }
    }



}

