package com.fanntt.project_uas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageSignup : AppCompatActivity() {

    private lateinit var txtLogin : TextView
    private lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_signup)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtLogin = findViewById(R.id.txtLOGIN)
        button2 = findViewById(R.id.button2)
        txtLogin.setOnClickListener(){
            val intentMenu2 = Intent(this@PageSignup,
                PageLogin::class.java)
            startActivity(intentMenu2)
        }

        button2.setOnClickListener(){
            val intentMenu2 = Intent(this@PageSignup,
                ListMakanan::class.java)
            startActivity(intentMenu2)
        }

    }

}