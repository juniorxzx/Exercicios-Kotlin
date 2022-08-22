class Produto (
    var nome: String = "",
    var validade: String = "",
        ){


    var peso = ""
    constructor(
        nome: String,
        validade: String,
        peso: String,
    ): this(nome, validade){
        this.peso = peso
    }

    fun cadastrarProduto(){
        if(nome == ""){
            println("Não foi possivel cadastrar produto sem nome!")
        } else if(validade == "") {
            println("O produto $nome - $peso(kg-g), foi cadastrado")
        } else if(peso == ""){
            println("O produto $nome, foi cadastrado e tem validade até $validade. " +
                    "Porém o peso não foi informado!")
        } else{
            println("O produto $nome - $peso(kg-g), foi cadastrado e tem validade até $validade! ")
        }

    }
}