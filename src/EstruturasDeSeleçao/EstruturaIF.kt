package EstruturasDeSeleçao
// Estruturas de Seleção (Estruturas Condicionais)
// As estruturas de seleção permitem que o programa execute diferentes blocos de código
// dependendo se uma condição é verdadeira ou falsa, ou se um valor corresponde a certas opções.


fun main() {
    val pontuacao = 75
    if (pontuacao >= 90) {
        println("Excelente")
    } else if (pontuacao >= 70) {
        println("Bom") // Este bloco é executado se a primeira condição for falsa e esta for verdadeira.
    } else {
        println("Precisa melhorar")
    }
}
/*
1. Estrutura 'if' (Se)
   - A estrutura 'if' é usada para executar um bloco de código se uma condição específica for verdadeira.
   - Pode ser acompanhada por 'else' (senão) para executar um bloco de código alternativo se a condição 'if' for falsa.
   - Pode ter 'else if' para verificar múltiplas condições em sequência.
*/