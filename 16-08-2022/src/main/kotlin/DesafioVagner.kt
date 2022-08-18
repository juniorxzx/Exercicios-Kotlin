fun main(){

    var total = 0
    print("Informe os anos: ")
    var anos = readln().toInt()

    print("Informe os meses: ")
    var meses = readln().toInt()

    print("Informe os dias : ")
    val dias = readln().toInt()


    meses *= 30
    anos = (anos * 12) * 30
    total = dias + meses + anos

    println("Você tem $total dias de vida.")










}