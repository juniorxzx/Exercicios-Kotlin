class Cliente (
    var nome: String = "",
    var email: String = "",
    var cpf: String = ""
) {
    var idade = 0

    constructor(
        nome: String,
        cpf: String,
        email: String,
        idade: Int
    ): this(nome, email, cpf ){
        this.idade = idade
    }

    fun cadastrarCliente(){
        println("$nome, do CPF: $cpf e com o email: $email, foi cadastrado com sucesso!")
    }
}