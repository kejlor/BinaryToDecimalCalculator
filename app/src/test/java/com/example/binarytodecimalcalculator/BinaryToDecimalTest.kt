package com.example.binarytodecimalcalculator

import junit.framework.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test
import java.lang.IllegalArgumentException

class BinaryToDecimalTest {
    @Test
    fun testCalculate11() {
        val binaryToDecimal = BinaryToDecimal()
        val result = binaryToDecimal.parse("11")
        assertEquals("3", result)
    }

    @Test
    fun testCalculate1001() {
        val binaryToDecimal = BinaryToDecimal()
        val result = binaryToDecimal.parse("1001")
        assertEquals("9", result)
    }

    @Test
    fun testCalculate11q() {
        val binaryToDecimal = BinaryToDecimal()
        val result = binaryToDecimal.parse("11q")
        val text = "Please input correct binary number"
        assertEquals(text, result)
    }

    @Test
    fun testCalculateEmptyValue() {
        val binaryToDecimal = BinaryToDecimal()
        val result = binaryToDecimal.parse("")
        val text = "Please input any binary number"
        assertEquals(text, result)
    }
}