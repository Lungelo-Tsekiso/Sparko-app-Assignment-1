package com.example.sparko

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sparko.R.id.backButton
import com.example.sparko.R.id.sparkDisplayTextView

class MentalHealthActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mental_health)

        // 1. Grab the spark message from the intent
        val spiritualMessage = intent.getStringExtra("CORA_SPARK")

        // 2. Display the text in your TextView
        val displayTextView = findViewById<TextView>(sparkDisplayTextView)
        displayTextView.text = spiritualMessage

        // 3. The Back Button logic
        findViewById<Button>(backButton).setOnClickListener {
            finish()
        }
    }
}