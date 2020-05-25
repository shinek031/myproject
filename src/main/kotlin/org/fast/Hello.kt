package org.fast

fun main() {
//    println("Hello world")
    Human().hello();
    val h =Human();
    h.hello();
}
class Human{
    fun hello(){
        println("Hello kotlin")
}
}