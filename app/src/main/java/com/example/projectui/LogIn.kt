package com.example.projectui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

lateinit var upassword : EditText
lateinit var uusername : EditText
lateinit var rintent : TextView
lateinit var btnsumitl :Button

class LogIn : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        // attributes from the xml file
        uusername = findViewById(R.id.username)
        upassword = findViewById(R.id.password)
        rintent = findViewById(R.id.registerpage)
        btnsumitl = findViewById(R.id.btnlogin)

        rintent.setOnClickListener{startActivity(Intent(this,userRegister::class.java))}
        btnsumitl.setOnClickListener{checking()}

    }

    fun checking(){

        if (uusername.text.toString().isEmpty() || upassword.text.toString().isEmpty()){

            Toast.makeText(this,"Please put your credentials",Toast.LENGTH_LONG).show()
        } else{
            Toast.makeText(this,"Welcome to our page",Toast.LENGTH_LONG).show()
            startActivity(Intent(this,dashboardActivity::class.java))
        }

    }

}