package Exercicios

fun main(){
    print("Digite o primeiro Exercicios.numero:")
    var num1 = readln().toInt()

    println()

    print("digite o Segundo Exercicios.numero:")
    var num2 = readln().toInt()

    println()

    print("Escolha +,-,* ou / :")
    var operator = readln()[0]

    when(operator){
        '+' -> println(num1+num2)
        '-' -> println(num1-num2)
        '*' -> println(num1*num2)
        '/' -> println(num1/num2)
        else -> print('0')
    }
}

//feito
