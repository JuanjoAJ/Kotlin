enum class Franja(val value:Int){
    UNO(1),
    DOS(2),
    TRES(3)
}

open abstract class Llamada(val nOrigen:String, val nDestino:String,val duracion:Double){
    var coste:Double = 0.0
}

class LlamadaLocal(nOrigen: String, nDestino: String, duracion: Double) : Llamada(nOrigen, nDestino, duracion
) {
}

class LlamadaProvincial:Llamada{
    constructor(nOrigen: String, nDestino: String, duracion: Double) : super(nOrigen, nDestino, duracion){
        this.coste=duracion*15
    }
}
class LLamadaNacional:Llamada{
    constructor(nOrigen: String, nDestino: String, franja:Franja, duracion: Double) : super(nOrigen, nDestino, duracion){
    if(franja.value==1) this.coste=duracion*20
    else if (franja.value==2) this.coste=duracion*25
    else this.coste=duracion*30
    }
}
class Centralita{
    lateinit var llamadasListado:ArrayList<Llamada>

    constructor(){
        this.llamadasListado= ArrayList()
    }
    constructor(llamadasListado: ArrayList<Llamada>) {
        this.llamadasListado = llamadasListado
    }

    fun registrarLlamada(llamada: Llamada){
        this.llamadasListado.add(llamada)
    }

    fun mostrarCostesTotales(){
        var costeTotal:Double=0.0
        this.llamadasListado.forEach{
            item ->
            costeTotal+=item.coste
        }
        println(costeTotal)
    }

    fun mostrarLlamadasRealizadas(){
       println(this.llamadasListado.joinToString { "Llamada con origen ${it.nOrigen}, destino ${it.nDestino}," +
               " con una duración de ${it.duracion} y un coste de ${it.coste}\n" })
    }
}

fun main(){
    var centralita:Centralita=Centralita()
    var llamadaLocal = LlamadaLocal("9999992", "999999", 3.0)
    var llamadaProvincial = LlamadaProvincial("927666666", "92788888", 30.2 )
    var lLamadaNacional= LLamadaNacional("9999999", "9999999", Franja.UNO, 40.3)

    centralita.registrarLlamada(llamadaLocal)
    centralita.registrarLlamada(llamadaProvincial)
    centralita.registrarLlamada(lLamadaNacional)
    centralita.mostrarCostesTotales()
    centralita.mostrarLlamadasRealizadas()


}