package com.example.binarytodecimalcalculator

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

class BinaryToDecimal {
    fun parse(s: String): String {
        if (s.contains("0") || s.contains("1")) {
            try {
                return Integer.parseInt(s, 2).toString()
            } catch (e: NumberFormatException) {
                return "Please input correct binary number"
            }
        } else if (s.isEmpty()) {
            return "Please input any binary number"
        } else {
            return "Please input correct binary number"
        }
    }
}
