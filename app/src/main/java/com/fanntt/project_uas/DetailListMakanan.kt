package com.fanntt.project_uas

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailListMakanan : AppCompatActivity() {

    private lateinit var txtDetailJenisMakanan: TextView
    private lateinit var txtDetailNamaMakanan : TextView
    private lateinit var imgDetailMakanan :ImageView
    private lateinit var txtDetailHargaMakanan : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_list_makanan)

        txtDetailNamaMakanan=findViewById(R.id.detailNamamakanan)
        txtDetailHargaMakanan=findViewById(R.id.detailHargaMakanan)
        txtDetailJenisMakanan=findViewById(R.id.detailJenisMakanan)
        imgDetailMakanan=findViewById(R.id.imgDetailMakanan)

        //get Data
        val detailNama = intent.getStringExtra("nama")
        val detailJenis = intent.getStringExtra("jenis")
        val detailHarga = intent.getStringExtra("harga")
        val imgMakanan = intent.getIntExtra("image",0)

        //transfer data

        imgDetailMakanan.setImageResource(imgMakanan)
        txtDetailNamaMakanan.setText(detailNama)
        txtDetailHargaMakanan.setText(detailHarga)
        txtDetailJenisMakanan.setText(detailJenis)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}