package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.text = "Let's Roll!"
        rollButton.setOnClickListener {
            // Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
        val resultText : TextView = findViewById(R.id.tvResult)
        val randomInt = (1..6).random() // generates a random int (between 0 - 6)
        resultText.text =randomInt.toString()
    }
}