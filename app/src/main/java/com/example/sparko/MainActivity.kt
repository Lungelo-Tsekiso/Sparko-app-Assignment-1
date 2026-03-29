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

                        val spark = if (timeOfDay.contains("mid-morning")) {
                            "Mid-morning Spark: Send a quick 'thinking of you' text to a sibling or cousin."
                        } else if (timeOfDay.contains("morning")) {
                            "Morning Spark: Send a 'Good morning' text to a family member."
                        } else if (timeOfDay.contains("snack")) {
                            "Snack Time Spark: Send a heart emoji to your family group chat."
                        } else if (timeOfDay.contains("afternoon")) {
                            "Afternoon Spark: Share a funny meme or interesting link with a family member."
                        } else if (timeOfDay.contains("dinner")) {
                            "Dinner Spark: Call a relative for a quick 5-minute catch-up while eating."
                        } else if (timeOfDay.contains("night") || timeOfDay.contains("after dinner")) {
                            "Night Spark: Leave a thoughtful comment on a family member's latest post."
                        } else {
                            "Family Spark: Reach out to a loved one just to say hi!"
                        }

                        intent.putExtra("CORA_SPARK", spark)
                        startActivity(intent)
                    }

                    "Work/School" -> {

                        val intent = Intent(this@MainActivity, WorkAndSchoolActivity::class.java)

                        val spark = if (timeOfDay.contains("mid-morning")) {
                            "Mid-morning Spark: Reach out to a colleague or classmate with a quick 'Thank you' for their help."
                        } else if (timeOfDay.contains("morning")) {
                            "Morning Spark: Send a supportive 'Good luck' message to someone starting a big task today."
                        } else if (timeOfDay.contains("snack")) {
                            "Snack Time Spark: Share an interesting article or resource with a study group or team."
                        } else if (timeOfDay.contains("afternoon")) {
                            "Afternoon Spark: Offer to help a teammate or peer with a tough concept for 10 minutes."
                        } else if (timeOfDay.contains("dinner")) {
                            "Dinner Spark: Send a 'Great job today' message to a coworker or fellow student."
                        } else if (timeOfDay.contains("night")) {
                            "Night Spark: Write a quick 'End of Day' update to a college or your employer."
                        } else {
                            "Work/School Spark: Send a quick message..."
                        }

                    }

                    "Friends" -> {

                        val intent = Intent(this@MainActivity, MentalHealthActivity::class.java)

                        val spark = if (timeOfDay.contains("mid-morning")) {
                            "Morning Spark: Send a 'Good morning' text to a friend you haven't spoken to this week."
                        } else if (timeOfDay.contains("morning")) {
                            "Mid-morning Spark: React to a friend's story or status with a supportive comment."
                        } else if (timeOfDay.contains("snack")) {
                            "Snack Time Spark: Send a funny meme or a quick 'This reminded me of you' link."
                        } else if (timeOfDay.contains("afternoon")) {
                            "Afternoon Spark: Ask a friend how their day is going or if they want to grab coffee soon."
                        } else if (timeOfDay.contains("dinner")) {
                            "Dinner Spark: Share a photo of your meal or a recipe with a foodie friend."
                        } else if (timeOfDay.contains("night") || timeOfDay.contains("after dinner")) {
                            "Night Spark: Send a 'Sleep well' message or a song recommendation for the evening."
                        } else {
                            "Friends Spark: Reach out to a friend just to let them know you're thinking of them!"
                        }

                    }

                    "LGBTQ+" -> {
                        val intent = Intent(this@MainActivity, LGBTQactivity::class.java)

                        val spark = if (timeOfDay.contains("morning")) {
                            "Morning Spark: Start your day with a positive affirmation: 'I am proud of who I am.'"
                        } else if (timeOfDay.contains("mid-morning")) {
                            "Mid-morning Spark: Reach out to a supportive friend or ally for a quick chat."
                        } else if (timeOfDay.contains("snack")) {
                            "Snack Time Spark: Look up an inspiring quote from an LGBTQ+ icon you admire."
                        } else if (timeOfDay.contains("afternoon")) {
                            "Afternoon Spark: Share a piece of queer media (song, book, or artist) with someone today"
                        } else if (timeOfDay.contains("dinner")) {
                            "Dinner Spark: Check in on a community group or forum to see how others are doing."
                        } else if (timeOfDay.contains("night") || timeOfDay.contains("after dinner")) {
                            "Night Spark: Reflect on a moment today where you felt truly seen and accepted."
                        } else {
                            "Community Spark: Celebrate your unique journey and the community that walks with you."
                        }

                    }
                    "Religious/Spiritual" -> {
                        val intent = Intent(this@MainActivity, SpiritualActivity::class.java)

                        val spark = if (timeOfDay.contains("morning")) {
                            "Morning Spark: Spend 5 minutes in silent prayer or meditation to center your soul"
                        } else if (timeOfDay.contains("mid-morning")) {
                            "Mid-morning Spark: Read a short passage from a sacred text or an inspiring spiritual book."
                        } else if (timeOfDay.contains("snack")) {
                            "Snack Time Spark: Offer a brief prayer of gratitude for the nourishment and energy you have."
                        } else if (timeOfDay.contains("afternoon")) {
                            "Afternoon Spark: Reach out to someone in your faith community just to say 'I'm thinking of you'."
                        } else if (timeOfDay.contains("dinner")) {
                            "Dinner Spark: Reflect on one blessing from today while you share a meal."
                        } else if (timeOfDay.contains("night") || timeOfDay.contains("after dinner")) {
                            "Night Spark: End your day with a prayer for peace and protection over your loved ones."
                        } else {
                            "Spiritual Spark: Take a deep breath and reconnect with the quiet peace within you."
                        }

                    }
                    "Mental Health" -> {
                    val intent = Intent(this@MainActivity, MentalHealthActivity::class.java)

                    val spark = if (timeOfDay.contains("morning")) {
                        "Morning Spark: Take 5 deep breaths and set one positive intention for your day."
                         } else if (timeOfDay.contains("mid-morning")) {
                        "Mid-morning Spark: Stretch your arms and neck. Remind yourself that you are doing your best."
                         } else if (timeOfDay.contains("snack")) {
                        "Snack Time Spark: Drink a glass of water mindfully. Notice the sensation and stay present."
                         } else if (timeOfDay.contains("afternoon")) {
                        "Afternoon Spark: Write down one thing you have accomplished today, no matter how small."
                         } else if (timeOfDay.contains("dinner")) {
                        "Dinner Spark: Put your phone away while you eat and focus on the flavors of your food."
                         } else if (timeOfDay.contains("night") || timeOfDay.contains("after dinner")) {
                        "Night Spark: List three things you are grateful for before you close your eyes to sleep."
                         } else {
                             "Mental Health Spark: Take a moment to simply be. You are enough exactly as you are."
                         }
                }
            }
        }
    }







