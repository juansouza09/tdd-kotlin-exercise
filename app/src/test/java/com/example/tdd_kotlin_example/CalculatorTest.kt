package com.example.tdd_kotlin_example

import org.junit.Test

import org.junit.Assert.*

class CalculatorTest {

    @Test
    fun `plus 2 by 2`() {
        val calculator = Calculator()
        val result = calculator.parse("3 + 2")
        assertEquals(5, result)
    }

    @Test
    fun `minus 2 by 2`() {
        val calculator = Calculator()
        val result = calculator.parse("2 - 3")
        assertEquals(-1, result)
    }

    @Test
    fun `should multiply 2 by 2`() {
        val calculator = Calculator()
        val result = calculator.parse("3 * 2")
        assertEquals(6, result)
    }

    @Test
    fun `should divide 2 by 2`() {
        val calculator = Calculator()
        val result = calculator.parse("2 / 2")
        assertEquals(1, result)
    }
}