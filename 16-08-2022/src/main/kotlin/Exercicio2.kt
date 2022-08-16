fun main(){

    var aux: Int = 0

    println("Digite o primeiro número:")
    var num1 = readln().toInt()

    println("Digite o segundo número:")
    var num2 = readln().toInt()

    println("Digite o terceiro número:")
    var num3 = readln().toInt()

    if (num1 > num2) {
        aux = num1;
        num1 = num2;
        num2 = aux;
    }

    if(num2 > num3) {
        aux = num2;
        num2 = num3;
        num3 = aux;

    }
    if (num1 > num2) {
        aux = num1;
        num1 = num2;
        num2 = aux;
    }

    println("Ordem crescente: $num1, $num2, $num3")

}