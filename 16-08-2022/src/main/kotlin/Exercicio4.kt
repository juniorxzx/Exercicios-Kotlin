import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    println("Digite um número:")
    val num = readln().toInt()


        if(num % 2 == 0){
            var quadrado = num.toFloat()
            quadrado = sqrt(quadrado.toFloat())
            println("Número par, raiz quadrada de $quadrado")
        }
        else {
            var raiz = num.toDouble()
            raiz = raiz.pow(2)
            println("Número ímpar, e elevado ao quadrado é: $raiz")
        }
    }

