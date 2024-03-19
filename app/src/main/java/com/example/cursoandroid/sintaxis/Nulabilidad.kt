package com.example.cursoandroid.sintaxis

fun main(){

    var name:String? = null

    println(name?.get(3)) // si no es null entonces dame el valor en la posicion 3
    println(name?.get(3) ?: "Es null wey") // -> pero si lo es retorna el mensaje "es null wey"
}

