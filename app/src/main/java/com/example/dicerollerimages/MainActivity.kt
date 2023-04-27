package com.example.dicerollerimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)


        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val imagem: ImageView = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val resultado: TextView = findViewById(R.id.text)
        val num: EditText = findViewById(R.id.num)
        val numberInt: Int = num.text.toString().toInt()
        val randomInt = (1..6).random()

        val aleatorios = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        if (numberInt == randomInt)
        {
            resultado.setText("Você ganhou")
        }
        else
        {
            resultado.setText("Você perdeu")
        }

        diceImage.setImageResource(aleatorios)

    }
}