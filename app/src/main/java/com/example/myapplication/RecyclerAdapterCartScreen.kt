package com.example.myapplication

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterCartScreen:RecyclerView.Adapter<RecyclerAdapterCartScreen.ViewHolder>() {

    private var itemtitlecartprd = arrayOf("Prodct Name","Prodct Name","Prodct Name","Product Name")





    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerAdapterCartScreen.ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_cart_screen,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapterCartScreen.ViewHolder, position: Int) {

        holder.itemtitlecartprd.text = itemtitlecartprd[position]


        holder.itemcartprdPrice2.setPaintFlags(holder.itemcartprdPrice2.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
    }

    override fun getItemCount(): Int {
        return itemtitlecartprd.size
    }

    inner class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        var itemImageprdcartview: ImageView
        var itemtitlecartprd: TextView
        var itemcartprdPrice1: TextView
        var itemcartprdPrice2 : TextView
        var itemprdQty: TextView
        var itemtotalprice: TextView

        init {

            itemImageprdcartview = itemview.findViewById(R.id.image_view_prd_cart_product)
            itemtitlecartprd = itemview.findViewById(R.id.item_title_cart_prd)
            itemcartprdPrice1 = itemview.findViewById(R.id.item_cart_prd_price1)
            itemcartprdPrice2 = itemview.findViewById(R.id.item_cart_prd_price2)
            itemprdQty = itemview.findViewById(R.id.item_prd_qty)
            itemtotalprice = itemview.findViewById(R.id.item_total_price)

        }
    }
}