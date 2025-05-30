package com.m6z1.context

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val boolean = applicationContext.isUiContext
        Log.d("moongchi", "onCreate: $boolean")

        findViewById<Button>(R.id.toast_button_activity_context).setOnClickListener {
            Toast.makeText(this, "액티비티 컨텍스트 사용한 토스트", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.toast_button_application_context).setOnClickListener {
            Toast.makeText(applicationContext, "애플리케이션 컨텍스트 사용한 토스트", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.next_button_activity_context).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        findViewById<Button>(R.id.next_button_application_context).setOnClickListener {
            startActivity(Intent(applicationContext, SecondActivity::class.java))
        }

    }

    companion object {
        val a = this
    }
}
