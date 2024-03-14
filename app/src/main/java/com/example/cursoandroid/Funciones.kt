package com.example.cursoandroid

fun main(){

    showMyName(name = "marco")
    showMyAge( age = 29)
    println(add(15,20))
    showMyAge()
}

fun showMyName(name:String){
    println("Me llamo $name")
}

fun showMyAge(age:Int = 30){
    println("Mi edad es $age años")
}

fun add(firstNum:Int, secondNum:Int):Int{
    return firstNum+secondNum
}