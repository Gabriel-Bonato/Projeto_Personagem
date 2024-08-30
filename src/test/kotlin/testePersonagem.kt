import Habilidade.Habilidade
import PlayerClass.Warrior
import org.example.Player.MyPlayer
import org.example.Race.Humano
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class testePersonagem {

    @Test
    fun testNomeDoJogador() {
        // Configura os objetos necessários para o teste
        val habilidades = Habilidade(8, 8, 8, 8, 8, 8)
        val personagem = MyPlayer("bonato321", Humano(), Warrior(), habilidades, 1.7F)

        // Verifica se o nome foi atribuído corretamente
        assertEquals("bonato321", personagem.nome)

        println("Rodou")
    }
}