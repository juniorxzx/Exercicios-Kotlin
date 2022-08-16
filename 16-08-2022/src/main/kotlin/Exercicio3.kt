fun main(){

    println("!!PROGRAMA PROIBIDO PARA MENORES DE 10 ANOS!!\n" +
            "Qual sua idade?")

    when(readln().toInt()){
        in 10..14 -> println("Infantil")
        in 15..17 -> println("Juvenil")
        in 18..25 -> println("Adulto")
        in 60..140 -> println("Velho")

        else -> println("Você não deveria usar esse programa.")
    }
}