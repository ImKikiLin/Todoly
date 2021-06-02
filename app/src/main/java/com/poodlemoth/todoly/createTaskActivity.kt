//Name: createTaskActivity.kt
//Purpose: It is the back-end for create task page where it takes all information and display when the save button is clicked.
//Date: June 1, 2020
//Author(s): Smit Patel, Isaiah Lee
//Dependencies: activity_createtask.xml, activity_main.xml

package com.poodlemoth.todoly

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.firebase.database.*


////firebase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class createTaskActivity : AppCompatActivity() {

    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createtask)
        database = Firebase.database.reference

        val prioritybutton = findViewById<android.widget.Button>(R.id.prioritybutton)
        prioritybutton.setOnClickListener {
            val intent = Intent(this, activity_priority::class.java)
            startActivity(intent)
        }

        val titleEdit = findViewById<EditText>(R.id.titleEdit)
        val descriptionEntry =  findViewById<EditText>(R.id.descriptionEntry)
        val editTextDate2 = findViewById<EditText>(R.id.editTextDate2)
        val linkedit = findViewById<EditText>(R.id.linkedit)

        val savetaskbutton = findViewById<android.widget.Button>(R.id.task_save)


        savetaskbutton.setOnClickListener {
            var tasktitle = findViewById(R.id.titleEdit) as EditText
            var description = findViewById(R.id.descriptionEntry) as EditText
            var date = findViewById(R.id.editTextDate2) as EditText
            var link = findViewById(R.id.linkedit) as EditText
            var priority = 2

            writeNewTask(tasktitle.text.toString(), date.text.toString(), description.text.toString(),link.text.toString(), priority)
            //val intent = Intent(this, MainActivity::class.java)
            //startActivity(intent)
        }
        savetaskbutton.setOnClickListener{
            val tasktitle = titleEdit.text.toString()
            val description = descriptionEntry.text.toString()
            val date = editTextDate2.text.toString()
            val link = linkedit.text.toString()

            val intent = Intent(this@createTaskActivity, MainActivity::class.java)
            intent.putExtra("Title", tasktitle)
            intent.putExtra("Description", description)
            intent.putExtra("Date", date)
            intent.putExtra("Link", link)
            startActivity(intent)
        }

    }


    private fun writeNewTask(Title: String, Date: String, Description: String, Link: String, Priority: Int) {

        val task = mapOf("Date" to Date, "Description" to Description, "Link" to Link, "Priority" to Priority)

        database.child("Tasks").child(Title).setValue(task)
    }
}

