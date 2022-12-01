package com.example.projectui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //waits three seconds then moves to log in activity

        supportActionBar?.hide()

        Handler().postDelayed({

               startActivity(Intent(this,LogIn::class.java))

        },3000)
    }
}