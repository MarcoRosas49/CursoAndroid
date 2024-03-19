package com.example.cursoandroid.sintaxis

fun main(){

    val weekdays = arrayOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")

    weekdays[0] = "otroDia"
    println(weekdays[0])

    for( pos in weekdays.indices){   //         en caso solo queramos la posición
        println(weekdays[pos])
    }

    for ((pos,value) in weekdays.withIndex() ){     // en caso queramos la posición y el valor
        println("Posición: $pos tiene el valor de: $value")
    }

    for (value in weekdays){                // en caso solo queramos el valor
        println("El valor es: $value")
    }
}