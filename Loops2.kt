package org.kotlinlang.play

class Jogo(val nome: String)

class Colecao(val jogos: List<Jogo>) {
    
    operator fun iterator(): Iterator<Jogo> {
        return jogos.iterator()
    }
}

fun main() {
    
    val jogos = listOf(Jogo("GTA"), Jogo("Lol"));
    val colecao = Colecao(jogos)
    
    for (jogo in colecao) {
        println("Esse jogo é o ${jogo.nome}")
    }
}