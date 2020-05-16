package com.kveola13.jba

data class CoffeeStatus(var waterAmount: Int = 400,
                        var milkAmount: Int = 540,
                        var beanAmount: Int = 120,
                        var cupAmount: Int = 9,
                        var currencyAmount: Int = 550)

fun coffeeShopCurrentStatus(coffeeStatus: CoffeeStatus): String{
    return(
        "The coffee machine has:\n${coffeeStatus.waterAmount} of water\n" +
                "${coffeeStatus.milkAmount} of milk\n" +
                "${coffeeStatus.beanAmount} of coffee beans\n" +
                "${coffeeStatus.cupAmount} of disposable cups\n" +
                "${coffeeStatus.currencyAmount} of money"
    )
}

fun main() {
    val cs = CoffeeStatus()
    cs.waterAmount = 5000
    println(coffeeShopCurrentStatus(cs))
}