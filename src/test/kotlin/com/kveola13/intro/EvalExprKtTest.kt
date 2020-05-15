package com.kveola13.intro

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EvalExprKtTest {

    @Test
    fun evalNumTest() {
        assertEquals(2, eval(Num(2)))
    }

    @Test
    fun evalSumTest() {
        assertEquals(4, eval(Sum(Num(2), Num(2))))
    }
}