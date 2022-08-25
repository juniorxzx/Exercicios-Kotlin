import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream

internal class FuncoesLojaKtTest{

    @BeforeEach
    fun cadastraTest(){
        val lista = "Pao"
        produto.add(lista)
    }

    @Test
    fun atualizarTest(){
        //simulando entrada do usuario
        System.setIn(ByteArrayInputStream("Pao".byteInputStream().readBytes()))
        System.setIn(ByteArrayInputStream("Cachaça".byteInputStream().readBytes()))

        val lista1 = mutableListOf("Cachaça")

        print(produto)
        atualizar()

        assertArrayEquals(lista1.toTypedArray(),getListProduto().toTypedArray())

    }
}