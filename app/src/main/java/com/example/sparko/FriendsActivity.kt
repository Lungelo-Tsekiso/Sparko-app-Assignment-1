package com.example.sparko

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FriendsActivity : AppCompatActivity() {
    // Inside FriendsActivity.kt
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        // 1. Catch the message
        val friendsMessage = intent.getStringExtra("CORA_SPARK")

        // 2. Display the message in the TextView
        val displayTextView = findViewById<TextView>(R.id.sparkDisplayTextView)
        displayTextView.text = friendsMessage

        // 3. Back button logic
        findViewById<Button>(R.id.backButton).setOnClickListener {
            finish()
        }
    }