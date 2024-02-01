package org.kotlinlang.play

fun main() {
    
    casos("Hello World!")
    casos("Teste")
    casos(1)
    casos(0.1)
    
}

fun casos(obj: Any) {
        when (obj) {
            "Hello World!" -> println("Olá Mundo!")
            is String -> println("Testando")
            is Int -> println(2)
            else -> println("Não encontrado.")
        }
}