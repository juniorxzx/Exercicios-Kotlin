fun main(){

    var pessoasCalmas = 0
    var mulheresNervosas = 0
    var homensAgressivos = 0
    var outrosCalmos = 0
    var nervoso40 = 0
    var calmo18 = 0


            println("Informe o numero de pessoas pesquisadas: ")
            var pessoas = readln().toInt()

        while(pessoas < 150){

            val idade = (1..100).random()
            println("Informe seu sexo\n" +
                    "1 - Masculino\n" +
                    "2 - Feminino\n" +
                    "3 - Outros")
            val sexo = readln().toInt()

            println("Informe seu caso\n" +
                    "1 - Calma\n" +
                    "2 - Nervosa\n" +
                    "3 - Agressiva")
            val caso = readln().toInt()

            if(caso == 1){
                pessoasCalmas++

            }
            if(caso == 1 && idade < 18){
                    calmo18++
            }else if(caso == 2 && sexo == 2){
                mulheresNervosas++
            }else if(caso == 3 && sexo == 1){
                homensAgressivos++
            }else if(caso == 1 && sexo == 3){
                outrosCalmos++
            }else if(caso ==2 && idade > 40){
                nervoso40++
            }

            println("Número de pessoas calmas: $pessoasCalmas\n")
            println("Número de mulheres nervosas: $mulheresNervosas\n")
            println("Número de homens agressivos: $homensAgressivos\n")
            println("Número de outros calmos: $outrosCalmos\n")
            println("Número de nervosos com mais de 40 anos: $nervoso40\n")
            println("Número de calmo com menos de 18 anos: $calmo18\n")

            pessoas++
    }



}
