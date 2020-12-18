package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
       var txtBirhtday:TextView = findViewById(R.id.txtResult)
       val name = intent.getStringExtra("name")

        txtBirhtday.text = "Good morning! $name Every morning is a new blessing, a second chance that life gives you because you’re so worth it. Have a great day ahead. "

    }
}