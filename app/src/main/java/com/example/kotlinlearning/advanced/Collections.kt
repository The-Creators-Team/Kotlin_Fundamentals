package com.example.kotlinlearning.advanced

fun main(){

    val listItems:List<Int> = listOf(9,5,1,5,5,9)
    val setItems:Set<Int> = setOf(9,5,1,5,5,9)
    val mapItems:Map<String,Int> = mapOf(
        Pair("First",1),
        Pair("secound",2),
        Pair("Third",3)
    )

    println(listItems)
    println(setItems)
    println(mapItems)


    val listItemChange:MutableList<Int> = mutableListOf()
    val setItemChange:MutableSet<Int> = mutableSetOf()
    val mapItemChange:MutableMap<String,Int> = mutableMapOf()


    listItemChange.addAll(listItems)
    setItemChange.addAll(setItems)
    mapItemChange.putAll(mapItems)

    listItemChange.removeAt(3)
    setItemChange.remove(9)

    println(listItemChange)
    println(setItemChange)
    println(mapItemChange)

}