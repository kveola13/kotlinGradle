package com.kveola13.intro

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PersonKtTest {

    @Test
    fun getPeople() {
        val p1 = Person("Alice", 29)
        val p2 = Person("Bob", 31)
        assertEquals(listOf(p1, p2), getPeople(p1, p2))
    }

    @Test
    fun comparePeople() {
        val p1 = Person("Alice", 29)
        val p2 = Person("Alice", 29)
        assertTrue(comparePeople(p1, p2))
    }
}