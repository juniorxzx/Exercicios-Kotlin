val produto = mutableListOf<String>()

fun cadastrar(nome: String) {

        if (nome != "") {
            produto.add(nome)
            println("($nome): adicionado com sucesso!")
        } else {
            println("Valor Inválido")
        }
    }


fun remover(){

    while (true){
        println("Agora digite alguém para ser excluído da lista: ")
        val nome = readln()

        if(produto.contains(nome)){
            produto.remove(nome)
            println("($nome): excluído com sucesso")
            break
        }else{
            println("($nome): não existe na lista")
        }
    }
}

fun atualizar(){
    println("Digite o nome do produto que deseja atualizar")
    val nome = readln()

    if(produto.contains(nome)) {
        val posicao = produto.indexOf(nome)
        println("Digite o novo nome do produto: ")
        produto[posicao] = readln()
        println("Produto atualizado com sucesso!")
    }
}

fun mostrar(){
    println()
    println(produto)
}