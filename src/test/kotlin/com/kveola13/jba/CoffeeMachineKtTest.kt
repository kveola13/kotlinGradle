package com.kveola13.jba

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CoffeeMachineKtTest {

    @Test
    fun makeCoffeeFromIngredientsTest() {
        val done: List<Int> = listOf(5000, 1250, 375)
        assertEquals(done, makeCoffeeFromIngredients(25))
    }

    @Test
    fun makeCoffeeFromIngredientsTest2() {
        val done: List<Int> = listOf(25000, 6250, 1875)
        assertEquals(done, makeCoffeeFromIngredients(125))
    }
}