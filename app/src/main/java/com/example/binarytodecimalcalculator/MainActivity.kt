package com.example.binarytodecimalcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binaryNumberInput = findViewById<EditText>(R.id.textInput)
        val binaryNumberOutput = findViewById<TextView>(R.id.resultOutput)
        val binaryToDecimal = BinaryToDecimal(this@MainActivity)

        binaryNumberInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                binaryNumberOutput.text =
                    binaryToDecimal.parse(binaryNumberInput.text.toString()).toString()
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
    }
}