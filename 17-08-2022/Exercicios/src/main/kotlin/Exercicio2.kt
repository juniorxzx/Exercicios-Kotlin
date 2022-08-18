fun main(){

    var par = 0
    var impar = 0


    for (i in 1..10){
        val num = (1..1000).random()
        if(num % 2 == 0){
            par++
        }else{
            impar++
        }
    }
    println("Números pares: $par\n")
    println("Números ímpares: $impar\n")
}