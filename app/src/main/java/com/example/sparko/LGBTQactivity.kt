package com.example.sparko

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LGBTQactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lgbtqactivity)


        val lgbtqMessage = intent.getStringExtra("CORA_SPARK")


        val displayTextView = findViewById<TextView>(R.id.sparkDisplayTextView)
        displayTextView.text = lgbtqMessage

        findViewById<Button>(R.id.backButton).setOnClickListener {
            finish()
        }
    }
}