package com.example.myapplication


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecylerAdapter(val context: Context): RecyclerView.Adapter<RecylerAdapter.ViewHolder>() {

    private var title = arrayOf("STORE NAME1","STORE NAME2","STORE NAME3","STORE NAME4","STORE NAME5","STORE NAME6","STORE NAME7","STORE NAME8")

    private var details1 = arrayOf("Address Line1","Address Line1","Address Line1","Address Line1","Address Line1","Address Line1","Address Line1","Address Line1")

    private var details2 = arrayOf("Address Line2","Address Line2","Address Line2","Address Line2","Address Line2","Address Line2","Address Line2","Address Line2")

    //private var imageView = intArrayOf(R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1)







    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecylerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_store_list_view,parent,false)
        return ViewHolder(v)
    }


    override fun onBindViewHolder(holder: RecylerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemDetails1.text = details1[position]
        holder.itemDetails2.text = details2[position]
       // holder.itemImage.setImageResource(imageView[position])

        holder.itemcardview1.setOnClickListener {
            val intent = Intent(context,StoreNameScreen::class.java)
            context.startActivity(intent)
        }



    }

    override fun getItemCount(): Int {
        return title.size
    }
    inner class ViewHolder(itemview : View): RecyclerView.ViewHolder(itemview){

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetails1: TextView
        var itemDetails2: TextView
        var itemcardview1 : CardView


        init {
            itemImage = itemview.findViewById(R.id.image_view)
            itemTitle = itemview.findViewById(R.id.item_title)
            itemDetails1 = itemview.findViewById(R.id.item_details1)
            itemDetails2 = itemview.findViewById(R.id.item_details2)
            itemcardview1 = itemview.findViewById(R.id.card_view)


        }


    }
}