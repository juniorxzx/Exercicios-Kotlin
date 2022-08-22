class Conta (
    var titular: String,
    var agencia: String,
    val conta: String,
    var saldo: Double
        ){

    fun consultarSaldo(){
        println("Saldo atual: R$$saldo")
    }

    fun sacar(valor: Int){
        if(saldo > 0.0 && valor <= saldo){
            saldo -= valor
            println("Saque de R$$valor foi realizado com sucesso!")
        }else{
            println("Saque de R$$valor é impossível de ser realizado!")
        }
    }

    fun deposito(valor: Int){
        if(valor > 0.0){
            saldo += valor
            println("Deposito de R$$valor foi realizado com sucesso!")
        }else{
            println("Deposito de R$$valor é impossível de ser realizado!")
        }
    }
}