class Paciente (
    var nome: String = "",
    var sus: String = "",
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

    fun cadastrarPaciente(){
        println("$nome - $idade anos, do CPF: $cpf e com o SUS: $sus, foi cadastrado com sucesso!")
    }
}
