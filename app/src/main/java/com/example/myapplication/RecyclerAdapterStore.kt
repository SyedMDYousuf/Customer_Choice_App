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

class RecyclerAdapterStore(val context: Context) : RecyclerView.Adapter<RecyclerAdapterStore.ViewHolder>() {

    private var title1 = arrayOf("Category Name1","Category Name2","Category Name3","Category Name4","Category Name5","Category Name6","Category Name7","Category Name8")

    private var descriptionline1 = arrayOf("Description Line 1","Description Line 1","Description Line 1","Description Line 1","Description Line 1","Description Line 1","Description Line 1","Description Line 1")

    private var descriptionlinw2 = arrayOf("Description Line 2","Description Line 2","Description Line 2","Description Line 2","Description Line 2","Description Line 2","Description Line 2","Description Line 2")

    //private var images = intArrayOf(R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapterStore.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_store, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapterStore.ViewHolder, position: Int) {
        holder.itemTitle1.text = title1[position]
        holder.itemDescriptionline1.text = descriptionline1[position]
        holder.itemDescriptionline2.text = descriptionlinw2[position]
        //holder.itemImage1.setImageResource(images[position])

        holder.itemcardviewstore.setOnClickListener {
            val intent = Intent(context,CategoryNameScreen::class.java)
            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return title1.size

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage1: ImageView
        var itemTitle1: TextView
        var itemDescriptionline1: TextView
        var itemDescriptionline2: TextView
        var itemcardviewstore: CardView
        init {
            itemImage1 = itemView.findViewById(R.id.image_view_store_name)
            itemTitle1 = itemView.findViewById(R.id.item_title_store_name)
            itemDescriptionline1 = itemView.findViewById(R.id.description_line_1)
            itemDescriptionline2 = itemView.findViewById(R.id.decription_line_2)
            itemcardviewstore = itemView.findViewById(R.id.card_view_store_name)
        }
    }


}
