package com.fanntt.project_uas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fanntt.project_uas.adapter.adaptermakanan
import com.fanntt.project_uas.model.modelMakanan

class ListMakanan : AppCompatActivity() {

    private var recyleView: RecyclerView? = null
    private var makananAdapter: adaptermakanan? = null
    private var makananlist =  mutableListOf<modelMakanan>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_makanan)

        makananlist = ArrayList()
        recyleView = findViewById(R.id.rv_makanan)
        makananAdapter = adaptermakanan(this,makananlist)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(
            this,1
        )
        recyleView!!.layoutManager = layoutManager
        recyleView!!.adapter = makananAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    prepareMovieList()
    }
    private fun prepareMovieList()
    {
        var makanan = modelMakanan("dimsum","makanan pembuka","$1500",R.drawable.img1)
        makananlist.add(makanan)
        makanan = modelMakanan("tortilla","makanan pembuka","$700",R.drawable.img2)
        makananlist.add(makanan)
        makanan = modelMakanan("pancake","desert","$390",R.drawable.pancake)
        makananlist.add(makanan)
        makanan = modelMakanan("steak","makanan utama","$670",R.drawable.steak)
        makananlist.add(makanan)
        makanan = modelMakanan("hamburger","makanan utama","$210",R.drawable.hamburger2)
        makananlist.add(makanan)



        makananAdapter!!.notifyDataSetChanged()
    }


}