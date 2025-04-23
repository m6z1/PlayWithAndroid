package com.m6z1.context

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        LayoutInflater.from(applicationContext)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.toast_button_activity_context).setOnClickListener {
            Toast.makeText(this, "액티비티 컨텍스트 사용한 토스트", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.toast_button_application_context).setOnClickListener {
            Toast.makeText(this, "애플리케이션 컨텍스트 사용한 토스트", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.next_button_activity_context).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        findViewById<Button>(R.id.next_button_application_context).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

    }
}
