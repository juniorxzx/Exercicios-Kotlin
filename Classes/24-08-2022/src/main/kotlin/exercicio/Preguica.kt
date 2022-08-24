package exercicio


class Preguica(nome: String, idade: Int, sexo: String) : Animal(nome, idade, sexo) {


    override fun emitirSom() {
        println("$nome está emitindo um som desconhecido!")
    }

    fun subirArvore() {
        println("$nome está subindo na árvore!")
    }

    override fun toString(): String {
        return "Preguiça = nome: $nome - idade: $idade - sexo: $sexo\n"
    }
}