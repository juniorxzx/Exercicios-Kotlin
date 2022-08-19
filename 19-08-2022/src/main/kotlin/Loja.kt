fun main(){

    while(true){
        print("APP DE GERENCIAMENTO DE LOJA\n" +
                "1 - Cadastrar produto\n" +
                "2- Remover produto\n" +
                "3 - Atualizar produto\n" +
                "4 - Exibir todos os produtos cadastrados\n" +
                "5 - Sair\n" +
                "Escolha uma opção: ")
        when(readln().toInt()) {
            1-> {
                println("Digite o número de produtos que deseja cadastrar: ")
                val vezes = readln().toInt()

                for (i in 1..vezes) {
                    println("Digite um nome do produto que deseja cadastrar: ")
                    val nome = readln()
                    cadastrar(nome)
                }
            }

            2 -> remover()

            3-> atualizar()

            4 -> mostrar()

            else ->{
            println("Saindo do programa! Adeus.")
            }
        }
    }
}