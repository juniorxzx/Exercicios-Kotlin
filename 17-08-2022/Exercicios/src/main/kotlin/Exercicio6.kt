fun main(){

    var total = 0
    var qtd = 0
    var media = 0
    do {
        print("Digite um número: ")
        val numero = readln().toInt()

        if(numero % 3 == 0 && numero > 0){
            total += numero
            qtd++
        }

    }while (numero != 0)

    media  = total / qtd

    println("A média é: $media")
}