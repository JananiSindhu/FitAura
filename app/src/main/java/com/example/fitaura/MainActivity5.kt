package com.example.fitaura

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity5 : androidx.activity.ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent5 = Intent(this, MainActivity7::class.java)
            startActivity(intent5)
        }
        val button20 = findViewById<Button>(R.id.button20)
        button20.setOnClickListener {
            val intent5 = Intent(this, MainActivity6::class.java)
            startActivity(intent5)
        }
        val button21 = findViewById<Button>(R.id.button21)
        button21.setOnClickListener {
            val intent5 = Intent(this, MainActivity8::class.java)
            startActivity(intent5)
        }

    }
}