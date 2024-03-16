package com.example.cursoandroid

fun main(){
    condicionalIf(name = "marco")
    beberCerveza(age = 18)

    condicionalMultiple(name = "juan", age = 19)
    
}


fun condicionalIf(name:String){

    if(name.uppercase() == "JUAN"){
        println("La variable name es $name")
    } else if (name == "marco"){
        println("Tu nombre es $name")
    }else{
        println("Tu nombre es undefined")
    }

}

fun beberCerveza(age:Int){

    if(age >= 18){
        println("Puedes tomar una cerveza")
    }else{
        println("Puedes tomar jugo")
    }
}

fun condicionalMultiple(name:String, age:Int){

    if (name != null && age >=18) println("Tu nombre es $name y puede tomar cerveza")
    else if(name != null && age < 18) println("Tu nombre es $name y solo puedes tomar jugo")
}