package com.example.binarytodecimalcalculator

import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.Assert
import org.junit.Test

class BinaryToDecimalParserTest {
    @Test
    fun shouldAssertEqualsForBinary11AndInput3() {
        val binaryToDecimal = BinaryToDecimal(InstrumentationRegistry.getInstrumentation().context)
        val result = binaryToDecimal.parse("11")
        Assert.assertEquals(3, result)
    }

    @Test
    fun shouldAssertEqualsForBinary1001AndInput9() {
        val binaryToDecimal = BinaryToDecimal(InstrumentationRegistry.getInstrumentation().context)
        val result = binaryToDecimal.parse("1001")
        Assert.assertEquals(9, result)
    }

    @Test
    fun shouldAssertEqualsForBinary0AndInput11q() {
        val binaryToDecimal = BinaryToDecimal(InstrumentationRegistry.getInstrumentation().context)
        val result = binaryToDecimal.parse("11q")
        Assert.assertEquals(0, result)
    }

    @Test
    fun shouldAssertEqualsForBinary0AndInputNull() {
        val binaryToDecimal = BinaryToDecimal(InstrumentationRegistry.getInstrumentation().context)
        val result = binaryToDecimal.parse("")
        Assert.assertEquals(0, result)
    }
}