package Habilidade

import org.example.Interfaces.iHability

class Habilidade : iHability{
    var forca: Int = 1
    var destreza: Int = 1
    var constituicao: Int = 1
    var inteligencia: Int = 1
    var sabedoria: Int = 1
    var carisma: Int = 1

    constructor(forca: Int, destreza: Int, constituicao: Int, inteligencia: Int, sabedoria: Int, carisma: Int){
        this.forca = forca
        this.destreza = destreza
        this.constituicao = constituicao
        this.inteligencia = inteligencia
        this.sabedoria = sabedoria
        this.carisma = carisma
    }

    override fun HabilityDefine(){

        print("Força: " + this.forca)
        print(", Destreza: " + this.destreza)
        print(", Constituição: " + this.constituicao)
        print(", Inteligencia: " + this.inteligencia)
        print(", Sabedoria: " + this.sabedoria)
        print(", Carisma: " + this.carisma)
    }

}