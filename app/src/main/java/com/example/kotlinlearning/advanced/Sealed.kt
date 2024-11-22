package com.example.kotlinlearning.advanced

sealed class Result

data class Success(val data:String):Result()
data class Error(val msg:String):Result()
object Loading:Result()

fun fetchData():Result{
    return Success("Data Fetched")
}

fun handleResult(result: Result){
    when(result){
        is Success->println(result.data)
        is Error->println(result.msg)
        Loading->println("Loading Data")
    }

}

fun main(){
    val res= fetchData()
    handleResult(res)

}