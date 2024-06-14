package com.example.fitaura

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ComponentActivity

class MainActivity2 : androidx.activity.ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button2 =findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent2 = Intent(this, MainActivity3::class.java)
            startActivity(intent2)
        }

    }
}