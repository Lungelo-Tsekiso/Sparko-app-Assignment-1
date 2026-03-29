package com.example.sparko

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sparko.R.id.sparkDisplayTextView

class FamilyActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_family)

        val sparkDisplayTextView = findViewById<TextView>(sparkDisplayTextView)
        val backButton = findViewById<Button>(R.id.backButton)

        val familyMessage = intent.getStringExtra("CORA_SPARK")

        sparkDisplayTextView.text = familyMessage ?: "Take a moment to hug your loved ones today!"

        backButton.setOnClickListener {
            finish()
        }
    }
}