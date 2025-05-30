package Variaveis
/*
para declararmos uma variavel temos que primeiro declarar se ela e imutavel ou não
usando as seguntes siglas("var" para variaveis mutaveis, ou seja ue podemos alterar o valor dela sem mexer na raiz da variavel)
e ("val" para vaiaveis imutaveis, ou seja não podemos mudar seu valor, apenas modificando-a na raiz da vaiavel)
 */
fun mutaveis (){
    var numero: Int = 10
    numero = 20 //observa-se que o valor da variável pode ser alterado
    println(numero)
}

fun imutaveis() {
    val numero2: Int = 10
    //numero2 = 20  (ao tentar alterar ira gerar um erro de sintax)
    println(numero2)
}

fun main(){
    mutaveis()
    imutaveis()
}

/*
É importante resaltar que usar variaveis imutaveis tem menos riscos
 */
