class Patinete (
    var modelo: String = "",
    var cor: String = "",
    var qtdRodas: Int = 0,
        ){

    fun cadastrarPatinete(){
        println("Patinete cadastrado com sucesso!\n" +
                "[modelo: $modelo - cor: $cor - rodas: $qtdRodas ]")
    }
}