package Exercicios

fun main(){
    println("Digite um Exercicios.numero:")
    var num = readln().toInt()

    if(num>10){
        num = 10
    }
   var result = num * num
   println(result)
}
//resolvido