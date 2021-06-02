package com.poodlemoth.todoly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_priority : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_priority)

        val low_button = findViewById<Button>(R.id.button)
        low_button.setOnClickListener {
            val intent = Intent(this, createTaskActivity::class.java)
            startActivity(intent) }

        val medium_button = findViewById<Button>(R.id.button3)
        medium_button.setOnClickListener {
            val intent = Intent(this, createTaskActivity::class.java)
            startActivity(intent) }

        val high_button = findViewById<Button>(R.id.button4)
        high_button.setOnClickListener {
            val intent = Intent(this, createTaskActivity::class.java)
            startActivity(intent) }

        val cancel_button = findViewById<Button>(R.id.cancel_button)
        cancel_button.setOnClickListener {
            val intent = Intent(this, createTaskActivity::class.java)
            startActivity(intent) }
    }
}