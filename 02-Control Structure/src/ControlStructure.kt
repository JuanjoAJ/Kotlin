/*1. Escribe un programa que lea un número entero y que indique si es par o impar.
2. Escribe un programa que lea un número entero y que indique si es positivo, negativo o cero.
3. Escribe un programa que lea un número entero y que indique si es primo o no.
4. Escribe un programa que lea un número entero y que muestre por pantalla todos los números primos menores o iguales al número leído.
5. Escribe un programa que lea un número entero y que calcule el factorial de ese número.
6. Escribe un programa que lea un número entero y que calcule la suma de los primeros N números naturales.
7. Escribe un programa que lea un número entero y que calcule la suma de los dígitos de ese número.
8. Escribe un programa que lea un número entero y que muestre por pantalla su representación en binario.
9. Escribe un programa que lea un número entero y que muestre por pantalla su representación en hexadecimal.
10. Escribe un programa que lea un número entero y que muestre por pantalla su representación en octal.*/

//1
fun parImpar(num: Int) {
    if (num % 2 == 0) println("El número es par") else println("El número es impar")
}
//2
fun posNeg(num:Int){
    if (num>0) println("El número es positivo") else if (num<0) println("El número es negativo") else println("El número es 0")
}
//3
fun esPrimo(num:Int):Boolean{
    if(num<=1) return false
    for (i in 2..<num){
        if(num%i==0) return false
    }
    return true
}
//4
fun primoMenor(num:Int):ArrayList<Int>{
    val array:ArrayList<Int> = ArrayList<Int>()
   for(i in 2..num){
       if (esPrimo(i)) array.add(i)
   }
    return array
}
//5
fun factorial(num:Int):Int{
    var aux:Int
    aux=num
    for(i in 1..<num){
        aux*=i;
    }
    return aux
}
//6
var sumaNatural:(Int)->Int={ num:Int ->
    var sum=0
for(i in 1..num){
    sum+=i
}
    sum
}
//7
fun sumDigito(num:Int):Int{
    var aux=num;
    var sum=0;
    while(aux!=0){
        sum+=aux%10
        aux/=10

    }
return sum
}
//8
fun binario(num:Int):String{
    var num1=num
    var bin:String=""
    var aux=0
    if (num<=0) return "0"
    while (num1>0){
       aux=num1%2
       bin=aux.toString()+bin
       num1/=2
    }
    return bin
}
//9
fun hexadecimal(num:Int):String{
    var hexa:String=""
    var aux=0
    var numEj=num
    if(num<=0) return "0"
    while(numEj>0){
     aux=numEj%16
     hexa= (if (aux < 10) {
         '0' + aux
     } else {
         'a' + (aux - 10)
     }).toString() + hexa
     numEj/=16
    }
    return hexa
}
//10
fun octal(num:Int):String{
    var octal=""
    var ocNum=num
    var aux=0
    if(ocNum<=0) return "0"
    while (ocNum>0){
        aux=ocNum%8
        octal=aux.toString()+octal
        ocNum/=8
    }
    return octal
}



fun main() {
    println("Introduce un número")
    val num = readln().toIntOrNull()
    if (num != null){
        parImpar(num)
        posNeg(num)
        if (esPrimo(num)) println("$num es primo") else println("No es primo")
        if(primoMenor(num).size>0) println(primoMenor(num)) else println("No hay primos menores")
        println("El factorial de $num es ${factorial(num)}")
        println("La suma de los primeros naturales de $num es ${sumaNatural(num)}")
        println("La suma de los dígitos es ${sumDigito(num)}")
        println("El binario es ${binario(num)}")
        println("El octal es ${octal(num)}")
        println("El hexadecimal es ${hexadecimal(num)}")

    } else println("Eso no era un número")
}
