package com.example.myapplication


import android.content.Context
import android.content.Intent
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_product_name.*

class RecyclerAdapterCategory(val context: Context):RecyclerView.Adapter<RecyclerAdapterCategory.ViewHolder>() {

    private var itemtitle = arrayOf(
        "Product NAME1",
        "Product NAME2",
        "Product NAME3",
        "Product NAME4",
        "Product NAME5",
        "Product NAME6",
        "Product NAME7",
        "Product NAME8"
    )

//    private var itemprice =
//        arrayOf("Rs.100", "Rs.100", "Rs.100", "Rs.100", "Rs.100", "Rs.100", "Rs.100", "Rs.100")

    private var itemdescription = arrayOf(
        "Description Line 1",
        "Description Line 1",
        "Description Line 1",
        "Description Line 1",
        "Description Line 1",
        "Description Line 1",
        "Description Line 1",
        "Description Line 1"
    )

/*
    private var imageView = intArrayOf(
        R.drawable.logo1,
        R.drawable.logo1,
        R.drawable.logo1,
        R.drawable.logo1,
        R.drawable.logo1,
        R.drawable.logo1,
        R.drawable.logo1,
        R.drawable.logo1
    )
*/


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerAdapterCategory.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_category, parent, false)
        return ViewHolder(v)
    }


    override fun onBindViewHolder(holder: RecyclerAdapterCategory.ViewHolder, position: Int) {
        holder.itemTitle.text = itemtitle[position]
       // holder.itemPrice.text = itemprice[position]
        holder.itemDescription.text = itemdescription[position]
        //holder.itemImage.setImageResource(imageView[position])

        holder.itemPrice2.setPaintFlags(holder.itemPrice2.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)


        holder.itemcardviewcategory.setOnClickListener {
            val intent = Intent(context,ProductName::class.java)
            context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return itemtitle.size
    }

    inner class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        var itemImage: ImageView
        var itemTitle: TextView
        var itemPrice1: TextView
        var itemPrice2 : TextView
        var itemDescription: TextView
        var itemcardviewcategory : CardView


        init {
            itemImage = itemview.findViewById(R.id.image_view_category)
            itemTitle = itemview.findViewById(R.id.item_title_category)
            itemPrice1 = itemview.findViewById(R.id.item_price1)
            itemPrice2 = itemview.findViewById(R.id.item_price2)
            itemDescription = itemview.findViewById(R.id.item_description)
            itemcardviewcategory = itemview.findViewById(R.id.card_view_category)

        }


    }
}