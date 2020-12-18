package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
   lateinit var btnclick:Button
   lateinit var etname:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnclick=findViewById(R.id.btnclick)
        etname = findViewById(R.id.etname)
        btnclick.setOnClickListener{
            val etname = etname.editableText.toString()
            val intent = Intent(this@MainActivity, ResultActivity::class.java)
            intent.putExtra("name", etname)
            startActivity(intent)
            Toast.makeText(this@MainActivity, "Button Click $etname", Toast.LENGTH_SHORT).show()

        }

    }


}