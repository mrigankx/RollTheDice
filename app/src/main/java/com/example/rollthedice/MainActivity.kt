package com.example.rollthedice

import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn : Button  = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        rollBtn.setOnClickListener {
            rollDice ()
        }
    }

    private fun rollDice() {
        val drawableRes = when(Random().nextInt(6)+1){
            1-> {
                R.drawable.dice_1
            }
            2-> {
                R.drawable.dice_2
            }
            3-> {
                R.drawable.dice_3
            }
            4-> {
                R.drawable.dice_4
            }
            5-> {
                R.drawable.dice_5
            }
            else-> {
                R.drawable.dice_6
            }
        }
        diceImage.setImageResource(drawableRes)

    }
}