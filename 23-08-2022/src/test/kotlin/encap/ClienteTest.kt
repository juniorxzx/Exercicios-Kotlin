package encap

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ClienteTest{

    var cliente = Cliente("Pedro", "suaddsad", "23023123")
    @BeforeEach
    fun inicializacao(){
        cliente.adicionarItem("Ovo")
        cliente.adicionarItem("Pao")
        cliente.adicionarItem("Leite")
    }
    @Test
    fun adicionarItemTest(){
        val list1 = mutableListOf("Ovo", "Pao", "Leite", "Pera")

        cliente.adicionarItem("Pera")

        assertTrue(list1.containsAll(cliente.getCliente()))
    }
}