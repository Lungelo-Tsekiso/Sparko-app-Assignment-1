package com.example.sparko

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MentalHealthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mental_health)

        // 1. Catch the mental health spark
        val mentalHealthMessage = intent.getStringExtra("CORA_SPARK")

        // 2. Find the TextView and display it
        val displayTextView = findViewById<TextView>(R.id.sparkDisplayTextView)
        displayTextView.text = mentalHealthMessage

        // 3. Back button so Cora can return to the main menu
        findViewById<Button>(R.id.backButton).setOnClickListener {
            finish()
        }
    }