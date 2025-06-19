package com.example.practicum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create variables for the buttons
        val addBtn = findViewById<Button>(R.id.addBtn)
        val exitBtn = findViewById<Button>(R.id.exitBtn)

        // Button takes you to the next screen
        addBtn.setOnClickListener {
            val intent = Intent(this,SongDetails::class.java)
            startActivity(intent)
        }

        // When button is clicked, app closes
        exitBtn.setOnClickListener {
            finishAffinity()
        }
    }
}