package org.example.Player

import Interfaces.iPlayerClass
import Interfaces.iRace
import org.example.Race.Humano

class MyPlayer { // usei "var" na maioria, pois são variaveis manipulaveis
    var nome: String
    val raca: iRace // val pois não é possível trocar sua raca
    val classe: iPlayerClass // val pois não é possível trocar sua classe de jogador
    val habilidade: iRace // val pois não é possível trocar sua habilidade(exclusiva do ser humano)
    var vida: Int
    var nivel: Int
    var xp: Float

    constructor(nome: String, raca: iRace, classe: iPlayerClass, habilidade: Humano) { // passando os valores no parâmetro pois não devem ser obrigatórios, mas padronizados
        this.nome = nome
        this.classe = classe
        this.raca = raca
        this.habilidade = habilidade
        this.vida = 10
        this.nivel = 1
        this.xp = 0.0F
    }

    fun mostrarJogador() {
        println("\n\n--------------------------------------------")
        println("Nome: " + this.nome)
        println("Raça: " + this.raca.RaceDefine())
        println("Classe: " + this.classe.ClassDefine())
        println("Habilidades: " + this.habilidade.RaceHability())
        println("Pontos de Vida: " + this.vida)
        println("Nivel: " + this.nivel)
        println("--------------------------------------------\n\n")
    }
}