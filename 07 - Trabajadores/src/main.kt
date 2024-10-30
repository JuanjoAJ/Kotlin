import controller.Empresa
import model.Asalariado
import model.Autonomo
import model.Jefe

fun main() {
    var empresa = Empresa()
    do {
    println(
        """
Bienvenido al gestor de empresa, elige una de las opciones:
        1. Registrar un trabajador
        2. Listar trabajadores
        3. Mostrar datos de un trabajador
        4. Despedir un trabajador
        5. Finalizar
    """
    )
    var opcion:Int = readln().toInt()
    var fin=false

        when(opcion){
         1 -> {
             println(
                 """Que tipo de trabajador quieres registrar
             |1. Jefe
             |2. Asalariado
             |3. Autonomo
         """.trimMargin()
             )
             var optionRegistro = readln()

             println("Nombre")
             var nombre= readln()
             println("Apellido")
             var apellido= readln()
             println("DNI")
             var dni= readln()
             println("Salario anual")
             var sueldo= readln().toDouble()

             when(optionRegistro){
                 "1","jefe" -> {
                     if (!empresa.isJefe()){
                         println("Numero de acciones")
                         var acciones= readln().toDouble()
                         println("Su porcentaje de beneficio")
                         var beneficio= readln().toDouble()
                         empresa.registrarTrabajador(Jefe(nombre, apellido, dni,acciones,beneficio, sueldo ))
                     }else println("Ya hay un jefe registrado")
                 }
                 "2","asalariado" -> {
                     println("¿Cuál es el número de pagas?")
                     var nPagas= readln().toInt()
                     empresa.registrarTrabajador(Asalariado(nombre, apellido, dni, sueldo, nPagas,true))


                 }
                 "3","autónomo", "autonomo" -> {
                     println("Cual es la cuota de la SS")
                     var cuotaSS= readln().toDouble()
                     empresa.registrarTrabajador(Autonomo(nombre, apellido, dni, sueldo, cuotaSS,true))
                 }
                 else -> println("Opción no reconocida")

             }

         }


         2 -> {
             println("""Que tipo de trabajador quieres listar
             |1. Jefe
             |2. Asalariado
             |3. Autonomo
         """.trimMargin())
             var opList = readln()
             empresa.listarTrabajadores(opList)
         }

         3 -> {
             println("Proporciona el dni del trabajador que quieres ver")
             val dni= readln()
             empresa.listarTrabajador(dni)
         }
         4 ->{
             println("Proporciona tu id como jefe")
             val dniJefe= readln()
             println("DNI del empleado que finaliza su contrato")
             val dniEmpleado= readln()
             empresa.despedirTrabajador(dniJefe, dniEmpleado)
         }
         5 -> fin=true
        }
    }while (!fin)

}