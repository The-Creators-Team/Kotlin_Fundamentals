package com.example.kotlinlearning.challenges




fun currencyDenominations(change:Float):String{



    val denominations = listOf(
        Pair(100.00f, "ONE HUNDRED"),
        Pair(50.00f, "FIFTY"),
        Pair(20.00f, "TWENTY"),
        Pair(10.00f, "TEN"),
        Pair(5.00f, "FIVE"),
        Pair(2.00f, "TWO"),
        Pair(1.00f, "ONE"),
        Pair(0.50f, "HALF DOLLAR"),
        Pair(0.25f, "QUARTER"),
        Pair(0.10f, "DIME"),
        Pair(0.05f, "NICKEL"),
        Pair(0.01f, "PENNY")
    )



    var remainingChange = change

    val result:MutableList<String> = mutableListOf()

    for (denomination in denominations){
        val (value,name)=denomination
        var count = (remainingChange/value).toInt()

        while (count > 0) {
            result.add(name)
            remainingChange -= value
            count = (remainingChange / value).toInt()
        }
    }





    return result.joinToString(",")

}


fun calculateChange(price:Float,totalCash:Float):String{
    if(totalCash < price) {
        return "Error"
    } else if(totalCash == price){
        return "ZERO"
    }else{
        val final:Float = totalCash - price
        val finalVal=String.format("%.2f", final)

        return currencyDenominations(finalVal.toFloat())
    }
}

fun main(){

    while(true){
        print("Enter Purchase Price and Cash Given seprated by semicolon : ")
        val input = readLine()!!


        if (input == "null" || input.isEmpty()) {
            println("Exiting program.")
            break
        }

        try{
            val price: Float = input.split(";")[0].toFloat()
            val totalCash: Float = input.split(";")[1].toFloat()

            println(price)
            println(totalCash)

            println(calculateChange(price, totalCash))
        }catch (e:Exception){
            println("Invalid input format. Please use the format 'purchasePrice;cashGiven'.")

        }
    }






}