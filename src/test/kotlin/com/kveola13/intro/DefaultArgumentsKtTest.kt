package com.kveola13.intro

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DefaultArgumentsKtTest {

    @Test
    fun useArguments() {
        assertEquals("Ola26", defaultArguments("Ola", 26))
    }
}