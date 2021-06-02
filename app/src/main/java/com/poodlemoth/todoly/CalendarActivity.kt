//Name: CalenderActivity.kt
//Purpose: It is the back-end for the back button inside the calendar page.
//Date: June 1, 2020
//Author(s): Smit Patel
//Dependencies: activity_month.xml, activity_main.xml

package com.poodlemoth.todoly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.view.View


class CalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month)

        val back_button = findViewById<Button>(R.id.back_button)
        back_button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) }

    }
}
