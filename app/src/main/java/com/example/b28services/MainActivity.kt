package com.example.b28services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            buttonStart.setOnClickListener {
                var i = Intent(this,MyService::class.java)
                startService(i)
            }

        buttonStop.setOnClickListener {
            var i = Intent(this,MyService::class.java)
            stopService(i)
        }
    }
}