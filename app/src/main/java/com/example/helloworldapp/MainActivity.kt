package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDecreaseClick(view: View) {
        count--
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = " $count"
    }


    fun onIncreaseClick(view: View) {
        count++
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "  $count"
    }
}