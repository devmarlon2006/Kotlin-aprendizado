package MetodosDeSaida

fun main () {
    val texto: String = "Olá" // Declarando os valore de uma variavel
    val texto2: String = "mundo"
    println(texto+texto2) // Imprimindo o valor de uma variavel
    println("$texto $texto2") // Melhor forma para juntar strings ou integrar o valor de uma variavel em um texto
                              // O $ e usado para colocar o valor de uma variavel dentro de um texto
                              // sem o $ o valor da variavel não será alocado
    println()
    println("Fazendo com numeros:")

    val num1: Int = 18
    println("você tem $num1 anos de idade!")

}