import encap.Cliente

fun main(args: Array<String>) {


    try {
        print("Digite seu nome: ")
        val nome = readln()

        print("Digite seu endereço: ")
        val endereco = readln()

        print("Digite seu telefone: ")
        val telefone = readln()

        val cliente1 = Cliente(nome, endereco, telefone)

        while (true){
            print("1 - Adicionar item no carrinho\n" +
                "2 - Remover item do carrinho\n" +
                "3 - Exibir item(ns) do carrinho\n" +
                "4 - Sair do programa" +
                "Escolha uma opção: ")
        when(readln().toInt()){
            1 -> {
                print("Digite o nome do produto que deseja adicionar: ")
                val comprinhas = readln()

                cliente1.adicionarItem(comprinhas)
            }
            2 -> {
                print("Digite o nome do produto que deseja remover: ")
                val comprinhas = readln()

                cliente1.removerItem(comprinhas)
            }
            3 -> {
                cliente1.exibirProdutos()
            }
            4 -> break
            else -> println("Opção inválida!!!")
        }
        }
    } catch (e:Exception){
        println(e.message)
    }





//    while (true){
//
//
    }
//}