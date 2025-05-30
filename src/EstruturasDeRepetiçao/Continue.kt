package EstruturasDeRepetiçao

fun main(){
    for(num  in 0 .. 100){
        if(num % 10 == 0){
            continue
        }
        print("${num},")
    }
}