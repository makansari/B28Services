package com.example.b28services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_splash_scrren.*

class SplashScrren : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_scrren)
        var handler = Handler()


        var th = Thread(){
            kotlin.run {
                for(i in 1..5){
                    Thread.sleep(1000)
                    handler.post {
                        textViewRes.setText("" + i)
                    }
                    runOnUiThread {
                        Toast.makeText(this, "NOt showing on worker thread",Toast.LENGTH_SHORT).show()

                    }
                }

            }
            startActivity(Intent(this,MainActivity::class.java))
        }
        th.start()
    }
}