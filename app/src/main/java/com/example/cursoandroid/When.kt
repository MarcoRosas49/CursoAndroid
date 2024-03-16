package com.example.cursoandroid

fun main(){

}


fun result (value:Any){  // Any: Puede ser cualquier valor

    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print("el valor es true")
    }
}

fun getTrimester(month: Int) : String{

    return when(month) {
        in 1.. 4 -> "Primer Trimestre" // rango entre el 1 y el 4
        5, 6, 7, 8 -> "Segundo Trimestre"
        9, 10, 11, 12 -> "Tercer Trimestre"

        !in 1..12 -> "Numero no valido" // Si NO está entre el 1 y el 12
        else -> "Dato no valido"
    }
}

fun getMonth(month:Int){

    when(month){
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Setiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")

        else -> println("No es un mes valido")
    }
}