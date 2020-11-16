package com.em4n0101.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    rollButton.setOnClickListener {
       rollDice()
    }
  }

  private fun rollDice() {

      val imageNameResource = when ((1..6).random()) {
      1 -> R.drawable.dice_1
      2 -> R.drawable.dice_2
      3 -> R.drawable.dice_3
      4 -> R.drawable.dice_4
      5 -> R.drawable.dice_5
      6 -> R.drawable.dice_6
      else -> R.drawable.dice_6
    }
    diceImageView.setImageResource(imageNameResource)
  }


}