package com.example.kotlinlearning.challenges

import com.google.android.material.transition.MaterialFade


fun validateDetails(cardNumber:String,bankIden:String,expiryValidation:String,expiryMonth:String,expiryYear:String):Boolean{

    fun getBankName(code:String):String{
        val check=when (code){
             "1121"->"ACEM"
             "1111"->"ALFA"
             "3796"->"AMEX"
            else-> "Bank Code ${code} is invalid"
        }
        return check
    }





    if(expiryMonth+expiryYear!=expiryValidation){
        return false
    }


    if(cardNumber.length!=16) {
        return false
    }



    if(expiryMonth.length!=2&&expiryYear.length!=2){
        return false
   }

    if(getBankName(bankIden).length>4){
        return false
    }

    return true


}

fun main(){
    try{

        print("Please Enter the 16 digit card number in this format XXXX-XXXX-XXXX-YYYY : ")

        val input=readLine()!!
        val bankCode=input.replace("-","")


        println(" ")

        print("Enter Expiry date in MM/YY Format: ")
        val input2=readLine()!!

        if(!bankCode.all{it.isDigit()}){
            println("False, Card contains Alphabetical values")
            return
        }


        val (expiryMonth, expiryYear) = input2.split("/")


        val bankIdentification=bankCode.take(4)
        val expiryValidation=bankCode.takeLast(4)


       println( validateDetails(bankCode,bankIdentification,expiryValidation,expiryMonth,expiryYear))



    }catch (e:Exception){
        println("SomeThing Went Wrong")

    }


}