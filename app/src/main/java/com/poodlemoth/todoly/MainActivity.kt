//Name: MainActivity.kt
//Purpose: It is the back-end for our app's main page. It controls all the buttons of the main page.
//Date: June 1, 2020
//Author(s): Smit Patel, Isaiah Lee, Armin Miller
//Dependencies: activity_main.xml

package com.poodlemoth.todoly;

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent
        val taskTitle = intent.getStringExtra("Title")
        val description = intent.getStringExtra("Description")
        val date = intent.getStringExtra("Date")
        val link = intent.getStringExtra("Link")

        val no_task = findViewById<TextView>(R.id.no_task2)
        no_task.text = "Tasks\n\nTitle: "+taskTitle+"\nDescription: "+description+"\nDate: "+date+"\nLink: "+link

        val newtaskbutton = findViewById<Button> (R.id.newtaskbutton)
        newtaskbutton.setOnClickListener {
            val intent = Intent(this, createTaskActivity::class.java)
            startActivity(intent)
        }

        val pomodoroBtn = findViewById<Button> (R.id.pomodoroBtn)
        pomodoroBtn.setOnClickListener {
            val intent = Intent(this, activity_pomodoro::class.java)
            startActivity(intent)
        }


        val calendarbutton = findViewById<ImageButton>(R.id.calendar_button)
        calendarbutton.setOnClickListener{
            val intent = Intent(this, CalendarMainActivity::class.java)
            startActivity(intent)
        }

    }
}
