package com.example.kotlinlearning.challenges


fun convertArrays(arr1:IntArray,arr2:IntArray):IntArray{

    val arr = arr1 + arr2
    val sortedArr = arr.sortedArray().toSet().toIntArray()


    return sortedArr

}

fun main(){
    print("Enter Array 1 Elements: ")
    val input1 = readLine()!!
    var arr1 = input1.split(",").map{it.toIntOrNull()}.filterNotNull().toIntArray()

    print("Enter Array 2 Elements: ")
    val input2 = readLine()!!
    var arr2 = input2.split(",").map{it.toIntOrNull()}.filterNotNull().toIntArray()

    println(convertArrays(arr1,arr2).joinToString())






}