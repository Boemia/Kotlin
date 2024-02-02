package org.kotlinlang.play 

fun main() {
    
    for (c in 'a'..'e') {
        print(c)
    }
    print(" ")
    for (c in 'g' downTo 'b' step 2) {
        print(c)
    }
    println()
    
    val x = 2
    
    if (x in 1..5) {
        print("x esta no range de 1 a 5")
    }
    println()
    
    if (x !in 6..10) {
        print("x não está no range entre 6 a 10")
    }
}