package com.example.kotlinlearning.advanced

data class User(val name:String,val age:Int)

fun main(){
    val u1=User("vihal",25)
    val u2=u1.copy(name="john")

    println("${u1.name},${u1.age}")
    println("${u2.name},${u2.age}")
    println(u1.toString())// returns string representation of an object

    val(name,age)=u1
    println("${name},${age}")

}