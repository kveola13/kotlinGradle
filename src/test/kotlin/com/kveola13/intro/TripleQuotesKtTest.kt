package com.kveola13.intro

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TripleQuotesKtTest {

    @Test
    fun tripleQuotes() {
        assertEquals("#question = \"who?\" #answer = yes", tripleQuotes("who?", "yes"))
    }

    @Test
    fun tripleQuotesAlt() {
        assertEquals("question = \"who?\"\nanswer = yes", tripleQuotesAlt("who?", "yes"))
    }
}