package Exercicios

fun main() {
    print("Digite seu nome:")
    val nome = readln()
    println("Seu nome é:$nome")

    print("Digite sua idade:")
    val age = readln().toInt()
    println("Sua idade é:$age")

    print("Digite sua altura:")
    val altu = readln().toFloat()
    println("Sua altura é:$altu")

    println("Ola $nome sua idade é $age, e sua altura é $altu.")

}
//resolvido