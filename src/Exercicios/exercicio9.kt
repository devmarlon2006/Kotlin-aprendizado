package Exercicios

var numero: Int = 0
var operaçao: Char = 'a'
var max: Int = 10
var resultado: Int = 0
var n: Int = 1

fun entrada(){
    print("Digite um Exercicios.numero de 1 a 10 para saber sua tabuada:")
    numero = readln().toInt()
    println("escolha uma forma de Exercicios.operaçao como, +, *:")
    operaçao = readln()[0]
}


fun process(){

    while (n <= max){

        if (operaçao == '+'){
            resultado = numero + n
        }else if(operaçao == '*'){
            resultado = numero*n
        }else if(operaçao == '/'){
            resultado = numero/n
        }else{
            println("error")
        }

        println("$numero $operaçao $n = $resultado")
        n++

    }

}


fun main () {
    entrada()
    process()
}

//Parcialmente resolvida


