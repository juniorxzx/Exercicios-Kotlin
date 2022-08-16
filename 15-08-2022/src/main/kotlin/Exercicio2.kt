fun main(){
    print("Digite o diâmetro do círculo: ")
    val diametro = readln().toDouble()

    val pi: Double =  3.14
    val area = (pi * (diametro * diametro)) / 4
    val perimetro = 2 * pi * (diametro / 2)

    println("A área do círculo é: ${"%.2f".format(area)}" +
            "\nO perímetro é: ${"%.2f".format(perimetro)}")


}