package com.example.sparko

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LGBTQactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lgbtqactivity) // Ensure this matches your XML file name!

        // 1. Grab the spark message
        val lgbtqMessage = intent.getStringExtra("CORA_SPARK")

        // 2. Display the text
        val displayTextView = findViewById<TextView>(R.id.sparkDisplayTextView)
        displayTextView.text = lgbtqMessage

        // 3. The Back Button
        findViewById<Button>(R.id.backButton).setOnClickListener {
            finish()
        }
    }