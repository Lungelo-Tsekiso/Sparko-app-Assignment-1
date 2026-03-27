package com.example.sparko

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.SpinnerAdapter
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.insets.Protection
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mySpinner: Spinner = findViewById(R.id.spinner)
        val options = arrayOf(
            "Family",
            "New friends/ friends",
            "Work/School",
            "Mental Health",
            "LGBTQ+",
            "Religious/Spiritual"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        mySpinner.adapter = adapter

        mySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedCategory = options[position]

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }


        // This connects the listener to your spinner
        mySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedCategory = options[position]
                val timeInput =
                    findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.textInputEditText)
                val timeOfDay = timeInput.text.toString().lowercase()

                var sparkmessage = "Time to reach out"

                when (selectedCategory) {
                    "Family" -> {
                        if (timeOfDay.contains("morning")) sparkmessage = "Send a 'Good Morning' text to family memeber."
                        else if (timeOfDay.contains("afternoon")) sparkmessage = "Share a memory or old photo with a relaytive."
                        else sparkmessage = "Send a loved one for a quick 5- minute catch-up "
                    }
                    "Work/School"->{
                        if (timeOfDay.contains("morning")) sparkmessage = "Reach out to a collegue with  quick 'Thank you for their help'"
                        else if ((timeOfDay.contains("afternoon")) sparkmessage = "Check in with a teamate"

                    }
                }

                val intent = when (selectedCategory) {
                    "FamilyActivity" -> Intent(this@MainActivity, FamilyActivity::class.java)
                    "FriendsActivity" -> Intent(this@MainActivity, FriendsActivity::class.java)
                    "WorkAndSchoolActivity" -> Intent(
                        this@MainActivity,
                        WorkAndSchoolActivity::class.java
                    )

                    "MentalHealthActivity" -> Intent(
                        this@MainActivity,
                        MentalHealthActivity::class.java
                    )

                    "LGBTQactivity" -> Intent(this@MainActivity, LGBTQactivity::class.java)
                    "SpiritualActivity" -> Intent(this@MainActivity, SpiritualActivity::class.java)


                }
            } // This closing brace closes the 'object'
        } // This closing brace closes 'onCreate'
    } // This closing brace closes the 'Class'
}






