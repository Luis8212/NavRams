package com.example.projectui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.net.FileNameMap

lateinit var fname : EditText
lateinit var lname:EditText
lateinit var uname : EditText
lateinit var rid : EditText
lateinit var pword : EditText
lateinit var cpword : EditText
lateinit var btnrs : Button

class userRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_register)

        fname = findViewById(R.id.editTextTextPersonName2)
        lname = findViewById(R.id.editTextTextPersonName3)
        uname = findViewById(R.id.editTextTextPersonName4)
        rid = findViewById(R.id.editTextTextPersonName5)
        pword = findViewById(R.id.editTextTextPassword2)
        cpword = findViewById(R.id.editTextTextPassword3)
        btnrs = findViewById(R.id.registerBtn)

        btnrs.setOnClickListener { checkingi() }


    }

    fun checkingi(){

        if (fname.text.toString().isEmpty() || lname.text.toString().isEmpty()
            || uname.text.toString().isEmpty() || rid.text.toString().isEmpty()
            || pword.text.toString().isEmpty() || cpword.text.toString().isEmpty()){

            Toast.makeText(this,"Do not leave any field blank", Toast.LENGTH_LONG).show()

        } else if (pword.text.toString() != cpword.text.toString()){
            Toast.makeText(this,"Password do not match",Toast.LENGTH_LONG).show()
        } else{
            Toast.makeText(this,"Registration successful \n Please log in",Toast.LENGTH_LONG).show()
            startActivity(Intent(this,LogIn::class.java))
        }
    }
}