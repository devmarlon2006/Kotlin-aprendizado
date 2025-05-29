package Variaveis
//variavel do tipo Int(inteiro)
fun variaveis(){

    val numero: Int = 10 //declarar uma variavel definindo seu tipo!

    val numer = 10  //declarar uma variavael sem precisar definir seu tipo!

    println("$numero e $numer") //mostrar valores, o cifrao($)e usado para colocar uma variavel em uma string

    println(numero + numer)  //soma de variaveis

    println()

//variaveis do tipo String(texto)

    val texto: String = "Olá" //declarando o tipo da variavel
    val texto2 = "mundo" // sem precisar declarar o tipo da variavel

    println("$texto $texto2")

    println()
// variaveis do tipo Char(Caractere)

    val caracter: Char = 'O'//observa-se que todo caracter fica dentro de aspas simples ''
    val caracter2: Char = 'l'
    val caracter3: Char = 'á'
    println("$caracter$caracter2$caracter3")//sera imprimida na tela a palavra "Ola"

    println()

}






fun main(){
    variaveis()
}