package com.example.sparko

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SpiritualActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spiritual)

        // 1. Grab the spark message from the intent
        val spiritualMessage = intent.getStringExtra("CORA_SPARK")

        // 2. Display the text in your TextView
        val displayTextView = findViewById<TextView>(R.id.sparkDisplayTextView)
        displayTextView.text = spiritualMessage

        // 3. The Back Button logic
        findViewById<Button>(R.id.backButton).setOnClickListener {
            finish()
        }
    }