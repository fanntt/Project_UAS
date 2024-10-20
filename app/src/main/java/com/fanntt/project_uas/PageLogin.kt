package com.fanntt.project_uas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {

    private lateinit var txtSignup : TextView
    private lateinit var button1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtSignup=findViewById(R.id.txtSignUp)
        button1=findViewById(R.id.button1)
        txtSignup.setOnClickListener(){
            val intentMenu2 = Intent(this@PageLogin,
                PageSignup::class.java)
            startActivity(intentMenu2)
        }

        button1.setOnClickListener(){
            val intentMenu2 = Intent(this@PageLogin,
                ListMakanan::class.java)
            startActivity(intentMenu2)
        }
    }
}