package Exercicios

fun main(){
    print("Digite sua idade:")
    var idade = readln().toInt()

    if (idade >= 0 && idade <= 12) {
        println("Criança")
    }else if(idade >= 13 && idade <= 17){
        println("Adolescente")
    }else if(idade >= 18 && idade <= 64){
        println("Adulto")
    }else if(idade >= 65 && idade <= 120) {
        println("Senior")
    }else{
        println("Invalido")
    }

}