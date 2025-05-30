package MetodosDeEntrada

fun main(){
    print("Digite seu nome:") // observa-se que eu não quebrei a linha adicionando ln
    val nome: String = readln()
    print("Digite sua Idade:")
    val idade: Int = readln().toInt() // observa-se que eu fiz a conversão do comando "readln()" para um inteiro pois o "readln()" por padrao tem como tipo de dado uma "String"
    println("Olá $nome!! você tem $idade anos de idade")
}

/*
o comando "readln()" serve como metodo de entrada de dados apartir do usuario,
como padrao ela sempre vem como um valor como string, entao para obter dados de
tipos diferentes e nescessario fazer sua conversão, !!cuidado pois pode resultar em erros
criticos!!
 */
