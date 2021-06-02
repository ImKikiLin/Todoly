package com.poodlemoth.todoly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newtask)

        val textView4: TextView = findViewById(R.id.textView4)
        textView4.setText("TO-DOLY")

        val imageView3: ImageView = findViewById(R.id.imageView3)
        imageView3.setImageResource(R.drawable.calendar_bg)

        val imageView4: ImageView = findViewById(R.id.imageView4)
        imageView4.setImageResource(R.drawable.brown_inner_box)

        val imageView5: ImageView = findViewById(R.id.imageView5)
        imageView5.setImageResource(R.drawable.month_title_box)

        val divider: ImageView = findViewById(R.id.divider)
        divider.setImageResource(R.drawable.orange_title_line)

        val back_button = findViewById<Button>(R.id.back_button)
        back_button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) }

        val view_button = findViewById<Button>(R.id.view_button)
        view_button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent) }

        val task_button = findViewById<Button> (R.id.task_button)
        task_button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent) }

    }

}