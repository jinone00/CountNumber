package com.example.chapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val addButton = findViewById<Button>(R.id.addButton)

        var number: Int = 0

        resetButton.setOnClickListener{
            number = 0
            numberTextView.text = number.toString()
        }

        addButton.setOnClickListener {
            number += 1
            numberTextView.text = number.toString()
        }

    }
}