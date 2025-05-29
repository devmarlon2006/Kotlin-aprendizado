package OperadoresLogicos

fun main() {
    println(5 <= 10)

    println()
    //op logicos
    //AND(&&)
    println(true && true)
    println(true && false)
    println(false && false)
    println(false && true)

    println( )
    //or(||)
    println(true||true)
    println(true||false)
    println(false||true)
    println(false||false)

    println()
    //not(!)
    println(!false)
    println(!true)

    println()
    //operadores de atribuição
    //operador de igualdade(=)
    var num1 = 10
    println(num1)

    num1 += 2 //num1 = num1 + 2 = 12//
    println(num1)

    num1 *= 2 //num1 * 2 = 20//
    println(num1)

    num1 /= 2 //num1 / 2 = 5//
    println(num1)

    num1 -= 2 //num1 - 2 = 8//
    println(num1)

    println()

    num1-- //num1 - 1//
    println(num1)

    num1++ //num1 + 1//
    println(num1)


}