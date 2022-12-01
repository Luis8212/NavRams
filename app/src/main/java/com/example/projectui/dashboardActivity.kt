package com.example.projectui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.Calendar

lateinit var btncalendar : Button
lateinit var btnschedule : Button
lateinit var btnaddcourse : Button

class dashboardActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btncalendar = findViewById(R.id.calendar)
        btnschedule = findViewById(R.id.schudule)
        btnaddcourse = findViewById(R.id.couseadd)

        btnschedule.setOnClickListener { startActivity(Intent(this,SchedulePage::class.java)) }
        btncalendar.setOnClickListener { startActivity(Intent(this,Calendar::class.java)) }
        btnaddcourse.setOnClickListener { startActivity(Intent(this,CourseAdd::class.java)) }
    }
}