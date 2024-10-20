package com.fanntt.project_uas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var btnlogin : Button
    private lateinit var btnsignup : Button
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnsignup=findViewById(R.id.btnSignup)
        btnlogin=findViewById(R.id.btnLogin)

        btnlogin.setOnClickListener(){
            val intentMenu2 = Intent(this@MainActivity2,
                PageLogin::class.java)
            startActivity(intentMenu2)
        }

        btnsignup.setOnClickListener(){
            val intentMenu2 = Intent(this@MainActivity2,
                PageSignup::class.java)
            startActivity(intentMenu2)
        }


    }
}