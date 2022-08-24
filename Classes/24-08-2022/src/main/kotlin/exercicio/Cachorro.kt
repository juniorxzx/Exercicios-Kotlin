package exercicio

class Cachorro(nome: String, idade: Int, sexo: String) : Animal(nome, idade, sexo) {


    override fun emitirSom() {
        println("$nome está latindo!")
    }

    override fun correr() {
        println("$nome está correndo!")
    }

    override fun toString(): String {
        return "Cachorro = nome: $nome - idade: $idade - sexo: $sexo\n"
    }
}