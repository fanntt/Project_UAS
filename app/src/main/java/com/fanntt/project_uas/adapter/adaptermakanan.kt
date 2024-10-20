package com.fanntt.project_uas.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.fanntt.project_uas.DetailListMakanan
import com.fanntt.project_uas.ListMakanan
import com.fanntt.project_uas.R
import com.fanntt.project_uas.model.modelMakanan

class adaptermakanan(
    private val getActivity : ListMakanan,// supaya item pada recycle dapat di klik
    private val makananlist : List<modelMakanan>



)  : RecyclerView.Adapter<adaptermakanan.MyViewHolder>() {
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val txtMakanan: TextView =itemView.findViewById(R.id.txtNamamakanan)
        val txtJenisMakanan : TextView = itemView.findViewById(R.id.txtJenisMakanan)
        val imgMakanan : ImageView = itemView.findViewById(R.id.imgMakanan)
        val cardmakanan : CardView = itemView.findViewById(R.id.cardviewMakanan)
        val txtHargaMakanan : TextView = itemView.findViewById((R.id.txtHargaMakanan))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.listmakanann,parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return makananlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMakanan.text = makananlist[position].namaMakanan
        holder.imgMakanan.setImageResource(makananlist[position].image)
        holder.txtJenisMakanan.text = makananlist[position].jenisMakanan
        holder.txtHargaMakanan.text = makananlist[position].hargaMakanan


        // supaya bisa di klik
        holder.cardmakanan.setOnClickListener(){

            //deklarasi intent
            val intent = Intent(getActivity, DetailListMakanan::class.java)
            //put Extra
            intent.putExtra("image", makananlist[position].image)
            intent.putExtra("nama",makananlist[position].namaMakanan)
            intent.putExtra("jenis",makananlist[position].jenisMakanan)
            intent.putExtra("harga",makananlist[position].hargaMakanan)

            // start pindah ke detail
            getActivity.startActivity(intent)

            Toast.makeText(getActivity,makananlist[position].namaMakanan, Toast.LENGTH_SHORT).show()

        }
    }
}