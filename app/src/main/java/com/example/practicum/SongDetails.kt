package com.example.practicum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SongDetails : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song_details)

        //Create variables for the buttons
        val nextBtn = findViewById<Button>(R.id.nextBtn)
        val backBtn = findViewById<Button>(R.id.backBtn)

        // variables for the input text that will have the info
        val songEditText = findViewById<EditText>(R.id.songEditText)
        val artistEditText = findViewById<EditText>(R.id.artistEditText)
        val ratingEditText = findViewById<EditText>(R.id.ratingEditText)
        val commentEditText = findViewById<EditText>(R.id.commentEditText)

        //Parallel arrays for the music details
        val songs = arrayOf("Thriller", "Say", "Headlines","Starboy")
        val artists = arrayOf("Michael Jackson", "Paul McCartney", "Drake","The Weeknd")
        val ratings = arrayOf("5", "5", "4","4")
        val comments = arrayOf("Favorite", "Best", "Very Good","Okay")

        //Get the text entered in th editText
        val song = songEditText.text.toString().trim()
        val artist = artistEditText.text.toString().trim()
        val rating = ratingEditText.text.toString().trim()
        val comment = commentEditText.text.toString().trim()

        //Button takes you to the next screen
        nextBtn.setOnClickListener {


            val intent = Intent(this,DetailViewScreen::class.java)
            startActivity(intent)
        }

        //Button returns you to the previous screen
        backBtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}