fun main(){

    var menor21 = 0
    var maior50 = 0
    var idade = 1


    while(idade > 0){
        print("Informe uma idade: ")
        idade = readln().toInt()
        if(idade < 21){
            menor21++
        }
        else if(idade > 50){
            maior50++
        }
        else if(idade == -99){
            break
        }

    }
    println("Pessoas com menos de 21 anos: $menor21")
    println("Pessoas com mais de 50 anos: $maior50")


}