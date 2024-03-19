package com.example.cursoandroid.sintaxis

fun main() {
    //listaInmutable()
    listaMutable()
}

fun listaInmutable() {
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "domingo")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //Filtrar
    val example = readOnly.filter { elem -> elem.contains("a") } //valor "it" se refiere al iterador
    println(example)
    //para cada elemento
    readOnly.forEach { elem -> println(elem) }
}

fun listaMutable(){

    var weekDays : MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "domingo")

    weekDays.add(0, "Nuevo Día") //Recibe un indice y el valor
    println(weekDays)

    if (weekDays.isNotEmpty()) weekDays.forEach { elem -> println(elem) }

    println( weekDays.last() )
}