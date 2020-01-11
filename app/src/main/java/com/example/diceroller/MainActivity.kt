package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables
        diceImage = findViewById(R.id.dice_image)


        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

//        val countUpButton: Button = findViewById(R.id.countUp_button)
//        countUpButton.setOnClickListener { countUp() }
//
//        val resetButton: Button = findViewById(R.id.reset_button)
//        resetButton.setOnClickListener { reset() }
    }

    private fun rollDice() {
        val diceRoll = Random().nextInt(6)+1
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        diceImage.setImageResource(drawableResource)
    }

//    private fun countUp() {
//        val currentCount: TextView = findViewById(R.id.result_text)
//        when (val textString = currentCount.text.toString()) {
//            ("Hello World!") -> currentCount.text = "1"
//            ("6") -> Toast.makeText(this, "Number is already 6", Toast.LENGTH_SHORT).show()
//            else -> {
//                val newValue = textString.toInt() + 1
//                currentCount.text = newValue.toString()
//            }
//        }
//
//    }

//    private fun reset() {
//        val currentText: TextView = findViewById(R.id.result_text)
//        currentText.text = "Hello World!"
//    }
}
