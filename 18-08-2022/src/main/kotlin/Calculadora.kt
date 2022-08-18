fun calcular(escolha: Int): Any {
        return if(escolha == 1) {
            var total = 0
            print("Digite o primeiro número: ")
            val n1 = readln().toInt()
            print("Digite o segundo número: ")
            val n2 = readln().toInt()

            total = n1 + n2

            println("O resultado da soma é $total")
        }else if(escolha == 2){
            var total = 0
            print("Digite o primeiro número: ")
            val n1 = readln().toInt()
            print("Digite o segundo número: ")
            val n2 = readln().toInt()

            total = n1 - n2

            println("O resultado da soma é $total}")
        } else if(escolha == 3){
            var total = 0
            print("Digite o primeiro número: ")
            val n1 = readln().toInt()
            print("Digite o segundo número: ")
            val n2 = readln().toInt()

            total = n1 / n2

            println("O resultado da soma é $total")
        }else if(escolha == 4){
            var total = 0
            print("Digite o primeiro número: ")
            val n1 = readln().toInt()
            print("Digite o segundo número: ")
            val n2 = readln().toInt()

            total = n1 * n2

            println("O resultado da soma é $total")
        }else{
            return 0
        }

}

fun main(){

    println("Escolha uma opção para seguir com a calculadora:\n" +
            "1 - Somar\n" +
            "2 - Subtrair\n" +
            "3 - Dividir\n" +
            "4 - Multiplicar\n")
    val escolha = readln().toInt()

    calcular(escolha)


}
