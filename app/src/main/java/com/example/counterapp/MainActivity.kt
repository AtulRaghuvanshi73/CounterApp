package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result_text : TextView = findViewById(R.id.result_text)
        val btn: Button = findViewById(R.id.button)

        btn.setOnClickListener(){
            result_text.setText(""+increaseCounter())
        }
    }

    fun increaseCounter(): Int{
        counter++
        return counter
    }
}