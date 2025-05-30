package EstruturasDeRepetiçao

fun main(){

    loop@ for (num in 0 .. 100){
             if (num == 50)
                 break@loop

        println(num)
    }
}