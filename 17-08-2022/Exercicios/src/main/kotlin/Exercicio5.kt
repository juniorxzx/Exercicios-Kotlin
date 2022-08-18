fun main(){


    var numero = 0
    var total = 0
    do{
        print("Digite um número: ")
        numero = readln().toInt()

        if(numero > 0){
            total += numero

        }
    } while(numero != 0)
        print("A soma dos números digitados é $total")
}