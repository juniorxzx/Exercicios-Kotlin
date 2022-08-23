package encap;

class Cliente (
    var nome: String,
    var endereco: String,
    var telefone: String
){

    private val listaDeCompras = mutableListOf<String>()


    init{
        if(nome.isBlank()){
            throw  Exception("Falha ao cadastrar!")
        }
    }

    fun adicionarItem(compra: String){

        if(compra.isNotBlank()){
            listaDeCompras.add(compra)
        }else{
            print("Produto inválido!")
        }
    }

    fun removerItem(compra: String){
        if(listaDeCompras.contains(compra)){
            listaDeCompras.remove(compra)
        }else{
            print("Produto inválido!")
        }
    }

    fun exibirProdutos (){
        println("~~~~~~~~Lista de compras~~~~~~~~\n")
        listaDeCompras.forEach {
            println(it)
        }
    }
}


