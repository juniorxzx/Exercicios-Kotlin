package exercicio

abstract class Animal (
    var nome: String,
    var idade: Int,
    var sexo: String
        ){

   abstract fun emitirSom()

   open fun correr(){
       println("Está correndo")
   }

}