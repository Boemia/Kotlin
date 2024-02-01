package org.kotlinlang.play

fun main() {
    
    println(casos("Hello World!"))
    println(casos("Teste"))
    println(casos(1))
    println(casos(0.1))
    
}

fun casos(obj: Any): Any {
        val result = when (obj) {
            "Hello World!" -> "Olá Mundo!"
            is String -> "Testando"
            is Int -> 2
            else -> "Não encontrado."
        }
      	return result
}