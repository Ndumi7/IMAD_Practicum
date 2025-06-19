package com.example.practicum

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.practicum.R.id.dislpayBtn

class DetailViewScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_view_screen)

        val displayBtn = findViewById<Button>(dislpayBtn)

        displayBtn.setOnClickListener {

        }
    }
}