package com.example.fitaura

import android.annotation.SuppressLint
import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.InternalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.tooling.preview.Preview
import com.example.fitaura.ui.theme.FitAuraTheme

class MainActivity : ComponentActivity() {

    @OptIn(InternalComposeUiApi::class)
    @SuppressLint("NewApi", "MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val button1 =findViewById<Button>(R.id.button1)
         button1.setOnClickListener {
            val intent1 =Intent(this,MainActivity2::class.java)
            startActivity(intent1)
        }

    }
}


