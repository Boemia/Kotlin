package org.kotlinlang.play 

fun main() {
    
    val lista1 = setOf("Morango", "Abacaxi", "Laranja")
    val lista2 = setOf("Abacaxi", "Laranja", "Morango")
    
    println(lista1 == lista2)
    println(lista1 === lista2)
}