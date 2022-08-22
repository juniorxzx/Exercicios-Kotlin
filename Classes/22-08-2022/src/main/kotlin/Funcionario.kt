class Funcionario (
    var nome: String = "",
    var idade: Int = 0,
    var cargo: String  = "",
){

    fun cadastrarFuncionario(){
        println("Funcionario ($nome - $idade anos - $cargo), foi cadastrado com sucesso. E começa na segunda!")
    }
}
