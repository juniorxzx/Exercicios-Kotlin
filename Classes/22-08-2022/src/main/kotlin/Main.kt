fun main(args: Array<String>) {



    print(
            "1 - Cadastrar cliente\n" +
            "2 - Cadastrar avião\n" +
            "3 - Cadastrar produto eletrônico\n" +
            "4 - Cadastrar funcionario\n" +
            "5 - Cadastrar patinete\n" +
            "6 - Cadastrar conta bancaria\n" +
            "7 - Cadastrar paciente\n" +
            "Escolha uma opção: ")

    when(readln().toInt()){
        1 ->{
            print("Digite o nome do cliente: ")
            val nome = readln()

            print("Digite o cpf do cliente: ")
            val cpf = readln()

            print("Digite o email do cliente: ")
            val email = readln()

            print("Digite a idade do cliente: ")
            val idade = readln().toInt()

            val cliente1 = Cliente(
                nome, cpf, email, idade
            )
            cliente1.cadastrarCliente()
        }

        2 -> {
            print("Digite o modelo do avião: ")
            val modelo = readln()

            print("Digite o código de produção do $modelo: ")
            val codigo = readln().toInt()

            print("Digite a marca do $modelo: ")
            val marca = readln()

            print("Digite a potência do $modelo: ")
            val potencia = readln().toInt()

            print("Digite o números de passageiros que esse avião suporta: ")
            val numeroPassageiros = readln().toInt()

            val aviao1 = Aviao(
                modelo, codigo, marca, potencia, numeroPassageiros
            )

            aviao1.cadastrarAviao()
        }

        3 -> {
            print("Insira o nome do produto: ")
            val nome = readln()

            print("Insira a validade desse produto: ")
            val validade = readln()

            print("Insira o peso do produto: ")
            val peso = readln()

            val produto1 = Produto(
                nome, validade, peso
            )

            produto1.cadastrarProduto()
        }

        4 ->{
            print("Digite o nome do funcionario: ")
            val nome = readln()

            print("Digite a idade de $nome: ")
            val idade = readln().toInt()

            print("Digite o cargo em que $nome vai trabalhar: ")
            val cargo = readln()

            val funcionario1 = Funcionario(
                nome, idade, cargo
            )

            funcionario1.cadastrarFuncionario()

        }
        5 ->{
            print("Digite o modelo do patinete: ")
            val modelo = readln()

            print("Digite a cor do patinete: ")
            val cor = readln()

            print("Digite a quantidade de rodas que o patinete possui: ")
            val qtdRodas = readln().toInt()

            val patinete1 = Patinete(
                modelo, cor, qtdRodas
            )

            patinete1.cadastrarPatinete()
        }
        6 -> {
            print("Digite o nome do cliente: ")
            val titular = readln()

            print("Digite a agencia: ")
            val agencia = readln()

            print("Digite a conta: ")
            val conta = readln()

            print("Digite o saldo inicial: ")
            val saldo = readln().toDouble()

            val conta1 = Conta(
                titular, agencia,
                conta, saldo
            )

            print("Digite o que quer fazer:\n" +
                    "1 - Consultar saldo\n" +
                    "2 - Sacar\n" +
                    "3 - Deposito\n" +
                    "4 - Sair")
            val escolha = readln().toInt()
            when(escolha){
                1 -> {
                    conta1.consultarSaldo()
                }
                2 -> {
                    print("Digite o valor que deseja sacar: ")
                    val valor = readln().toInt()

                    conta1.sacar(valor)
                }
                3 ->{
                    print("Digite o valor que deseja depositar: ")
                    val valor = readln().toInt()

                    conta1.sacar(valor)
                }
                4 ->{
                    print("Saindo do programa...")
                }
            }

        }
        7 ->{
            print("Digite o nome do paciente: ")
            val nome = readln()

            print("Digite o cpf do paciente: ")
            val cpf = readln()

            print("Digite o SUS do cliente: ")
            val email = readln()

            print("Digite a idade do cliente: ")
            val idade = readln().toInt()

            val paciente1 = Paciente(
                nome, cpf, email, idade
            )
            paciente1.cadastrarPaciente()
        }
        0 -> {
            return println("Saindo do programa...")
        }
    }






}