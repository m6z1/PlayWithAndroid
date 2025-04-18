package com.m6z1.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        Log.d("moongchi", "onCreate2: callback")
    }


    override fun onResume() {
        super.onResume()

        Log.d("moongchi", "onResume2: callback")
    }

    override fun onPause() {
        super.onPause()

        Log.d("moongchi", "onPause2: callback")
    }

    override fun onStop() {
        super.onStop()

        Log.d("moongchi", "onStop2: callback")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("moongchi", "onDestroy2: callback")
    }

    override fun onStart() {
        super.onStart()

        Log.d("moongchi", "onStart2: callback")
    }
}