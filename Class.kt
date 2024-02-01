package org.kotlinlang.play

class Usuario(var nome: String)

class Login(val id: Int, var email: String)

fun main() {
    
    val usuario = Usuario("Gabriel")
    
    val login = Login(1, "gabrielresende091002@gmail.com")
    
    println(usuario.nome)
    
    println(login.id)
    
    println(login.email)   
}