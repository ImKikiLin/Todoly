package com.poodlemoth.todoly

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class taskInput: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createtask)
    }

    fun onSaveButton(view: View) {
        val taskTitle = findViewById<EditText>(R.id.titleEdit).text.toString()
        val descrip = findViewById<EditText>(R.id.descriptionEntry).text.toString()
        val taskDate = findViewById<EditText>(R.id.editTextDate2).text.toString()
        val taskLink = findViewById<EditText>(R.id.linkedit).text.toString()

        val intent = Intent(this@taskInput, MainActivity::class.java)
        intent.putExtra("Title", taskTitle)
        intent.putExtra("Description", descrip)
        intent.putExtra("Date", taskDate)
        intent.putExtra("Link", taskLink)
        startActivity(intent)
    }
}