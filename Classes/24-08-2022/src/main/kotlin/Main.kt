import exercicio.Cachorro
import exercicio.Cavalo
import exercicio.Preguica

fun main(args: Array<String>) {


    print(
        "Selecione o animal:\n" +
        "1- Cachorro\n" +
        "2- Cavalo\n" +
        "3- Preguiça\n" +
        "Opção: ")
    when(readln().toInt()){
        1 -> {
            print("Digite o nome do cachorro: ")
            val nome = readln()
            print("Digite a idade de $nome: ")
            val idade = readln().toInt()
            print("Digite o sexo de $nome: ")
            val sexo = readln()

            val cachorro = Cachorro(nome, idade, sexo)

            print("Selecione um item\n" +
                    "1- Emitir som\n" +
                    "2- Pedir para sair\n" +
                    "3- Informações do animal\n" +
                    "Escolha: ")
            when(readln().toInt()){
                1 -> cachorro.emitirSom()
                2 -> cachorro.correr()
                3 -> println(cachorro)
            }
        }
        2 -> {
            print("Digite o nome do cavalo: ")
            val nome = readln()
            print("Digite a idade de $nome: ")
            val idade = readln().toInt()
            print("Digite o sexo de $nome: ")
            val sexo = readln()

            val cavalo = Cavalo(nome, idade, sexo)

            print("Selecione um item\n" +
                    "1- Emitir som\n" +
                    "2- Pedir para sair\n" +
                    "3- Informações do animal\n" +
                    "Escolha: ")
            when(readln().toInt()){
                1 -> cavalo.emitirSom()
                2 -> cavalo.correr()
                3 -> println(cavalo)
            }
        }
        3 -> {
            print("Digite o nome da preguiça: ")
            val nome = readln()
            print("Digite a idade de $nome: ")
            val idade = readln().toInt()
            print("Digite o sexo de $nome: ")
            val sexo = readln()

            val preguica = Preguica(nome, idade, sexo)

            print("Selecione um item\n" +
                    "1- Emitir som\n" +
                    "2- Pedir para sair\n" +
                    "3- Informações do animal\n" +
                    "Escolha: ")
            when(readln().toInt()){
                1 -> preguica.emitirSom()
                2 -> preguica.subirArvore()
                3 -> println(preguica)
            }
        }
    }
}