package com.kveola13.intro

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class JoinOptionsKtTest {

    @Test
    fun joinOptions() {
        val col: Collection<String> = listOf("a", "b", "c")
        assertEquals("[a, b, c]", joinOptions(col))
    }
}