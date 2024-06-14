package com.example.fitaura

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ComponentActivity

class MainActivity3 : androidx.activity.ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent3 = Intent(this,MainActivity4::class.java)
            startActivity(intent3)
        }
    }
}