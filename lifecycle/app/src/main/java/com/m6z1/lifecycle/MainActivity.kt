package com.m6z1.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onStart() {
        super.onStart()

        Log.d("moongchi", "onStart: callback")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button: Button = findViewById(R.id.btn_next_view)
        button.setOnClickListener {

            finish()
            Thread.sleep(4000)
            startActivity(Intent(this, SecondActivity::class.java))

        }

        Log.d("moongchi", "onCreate: callback")
    }


    override fun onResume() {
        super.onResume()

        Log.d("moongchi", "onResume: callback")
    }

    override fun onPause() {
        super.onPause()

        Log.d("moongchi", "onPause: callback")
    }

    override fun onStop() {
        super.onStop()

        Log.d("moongchi", "onStop: callback")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("moongchi", "onDestroy: callback")
    }
}
