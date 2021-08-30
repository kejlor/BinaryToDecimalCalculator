package com.example.binarytodecimalcalculator

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

class BinaryToDecimal constructor(private val context: Context) {
    fun parse(s: String): Int {
        try {
            if (s.contains("0") || s.contains("1")) {
                return Integer.parseInt(s, 2)
            } else if (s.isEmpty()) {
                Handler(Looper.getMainLooper()).post {
                    Toast.makeText(context, "Please input any binary number", Toast.LENGTH_SHORT).show()
                }
                return 0
            } else {
                Handler(Looper.getMainLooper()).post {
                    Toast.makeText(context,"Please input correct binary number", Toast.LENGTH_SHORT).show()
                }
                return 0
            }
        } catch (exception: IllegalArgumentException) {
                Handler(Looper.getMainLooper()).post {
                    Toast.makeText(context, "Please input correct binary number", Toast.LENGTH_SHORT).show()
            }
            return 0
        }
    }
}