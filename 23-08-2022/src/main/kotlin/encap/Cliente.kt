package encap;

class Cliente (
    var nome: String,
    var endereco: String,
    var telefone: String
){

    private val _listaDeCompras = mutableListOf<String>()

    init{
        if(nome.isBlank()){
            throw  Exception("Falha ao cadastrar!")
        }
    }

    fun getCliente(): MutableList<String> {
        return this._listaDeCompras
    }

    fun adicionarItem(compra: String){

        if(compra.isNotBlank()){
            _listaDeCompras.add(compra)
        }else{
            print("Produto inválido!")
        }
    }

    fun removerItem(compra: String){
        if(_listaDeCompras.contains(compra)){
            _listaDeCompras.remove(compra)
        }else{
            print("Produto inválido!")
        }
    }

    fun exibirProdutos (){
        println("~~~~~~~~Lista de compras~~~~~~~~\n")
        _listaDeCompras.forEach {
            println(it)
        }
    }
}


