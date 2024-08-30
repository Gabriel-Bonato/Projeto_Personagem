import Habilidade.Habilidade
import PlayerClass.Warrior
import org.example.Player.MyPlayer
import org.example.Race.Humano

fun main(args: Array<String>){
    var habilidades = Habilidade(8, 8, 8, 8, 8, 8)
    var personagem = MyPlayer("bonato321", Humano(), Warrior(), habilidades, 1.4F)

    personagem.mostrarJogador()
}