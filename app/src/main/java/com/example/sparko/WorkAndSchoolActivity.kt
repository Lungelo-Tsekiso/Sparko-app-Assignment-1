package com.example.sparko

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WorkAndSchoolActivity : AppCompatActivity() {
    // Inside WorkAndSchoolActivity.kt
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_and_school)

        // Grab the message from the Intent
        val workMessage = intent.getStringExtra("CORA_SPARK")

        // Find the TextView and set the text
        // (Make sure the ID matches your activity_work_and_school.xml)
        val displayTextView = findViewById<TextView>(R.id.sparkDisplayTextView)
        displayTextView.text = workMessage

        // Back button to return to Main
        findViewById<Button>(R.id.backButton).setOnClickListener {
            finish()
        }
    }