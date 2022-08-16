import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main(){


    val ano = LocalDate.now().year
    var escolha = 0

    println("Você já fez aniversário esse ano? " +
            "\n1 - Sim" +
            "\n2 - Não")
    escolha = readln().toInt()

    when(escolha){
        1 -> {
            print("Digite sua idade: ")
            val idade = readln().toInt()

            println("Você nasceu em ${ano - idade}")
        }
        2 -> {
            print("Digite sua idade: ")
            val idade = readln().toInt()

            println("Você nasceu em ${(ano - idade) - 1}")
        }
    }



}