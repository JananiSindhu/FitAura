package com.example.fitaura

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ComponentActivity

class MainActivity4 : androidx.activity.ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent4 = Intent(this,MainActivity5::class.java)
            startActivity(intent4)
        }
    }
}