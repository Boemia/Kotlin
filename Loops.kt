package org.kotlinlang.play

fun comerUmLanche() = println("Comeu um lanche")
fun prepararUmLanche() = println("Preparou um lanche")

fun main() {
    
   	var lanchesComidos = 0
    var lanchesPreparados = 0
    
    while (lanchesComidos < 5) {
        comerUmLanche()
        lanchesComidos ++
    }
   
   do {
       prepararUmLanche()
       lanchesPreparados ++
   }
   while (lanchesPreparados < lanchesComidos)
}