package com.em4n0101.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    rollDice()

    rollButton.setOnClickListener {
       rollDice()
    }
  }

  private fun rollDice() {
    randomNumberTextView.text = (1..6).random().toString()
  }


}