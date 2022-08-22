class Aviao(
    var modelo: String = "",
    var codigo: Int = 0,
    var marca: String = "",
){
    var potencia = 0
    var numeroPassageiros = 0

    constructor(
        modelo: String,
        codigo: Int,
        marca: String,
        potencia: Int,
        numeroPassageiros: Int,
    ): this(modelo, codigo, marca){
        this.potencia = potencia
        this.numeroPassageiros = numeroPassageiros
    }

    fun cadastrarAviao(){
        println("O avião do modelo: $modelo, que possui o código: $codigo e é da marca: $marca. " +
                "Tem potência de $potencia e suporta até $numeroPassageiros!")
    }
}