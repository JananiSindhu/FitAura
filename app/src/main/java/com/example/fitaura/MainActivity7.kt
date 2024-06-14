package com.example.fitaura

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ComponentActivity

class MainActivity7 : androidx.activity.ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent7 = Intent(this, MainActivity7::class.java)
            startActivity(intent7)
        }
    }
}