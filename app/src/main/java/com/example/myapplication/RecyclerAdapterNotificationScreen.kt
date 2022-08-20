package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterNotificationScreen:RecyclerView.Adapter<RecyclerAdapterNotificationScreen.ViewHolder>() {


    private var itemTitleNotification = arrayOf("Notification Title","Notification Title","Notification Title","Notification Title","Notification Title")




    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerAdapterNotificationScreen.ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_notification_screen,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(
        holder: RecyclerAdapterNotificationScreen.ViewHolder,
        position: Int
    ) {
        holder.itemNotificationtitle.text = itemTitleNotification[position]


    }

    override fun getItemCount(): Int {
        return itemTitleNotification.size
    }

    inner class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){


        var itemNotificationimg : ImageView
        var itemNotificationtitle : TextView
        var itemNotificationdescription : TextView

        init {

            itemNotificationimg = itemview.findViewById(R.id.notification_img)
            itemNotificationtitle = itemview.findViewById(R.id.txt_notification_title)
            itemNotificationdescription = itemview.findViewById(R.id.txt_notification_description)
        }
    }



}