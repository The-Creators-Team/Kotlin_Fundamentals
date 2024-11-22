package com.example.kotlinlearning.advanced

data class Person(var name:String,var age:Int)

fun main(){
    val p1:Person? = Person("vihal",25)

    //let
    p1?.let{
        println(it.name)
    }

    //apply
    val p2=Person("John",30).apply{
        name="bob"
        age=35
    }

    println(p2)

    //run
    val doubleAge=p2.run{
        age*2
    }
    println(doubleAge)


    //with
    val description = with(p1!!){
        "$name is $age years old"
    }
    println(description)

    //also
    p2.also{
        println("name without last name ${it.name}")
    }.apply{name ="bob stanley"}

    println(p2)
}
