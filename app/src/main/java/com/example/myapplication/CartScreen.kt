package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_cart_screen.*

class CartScreen : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? =null
    private var adapter: RecyclerView.Adapter<RecyclerAdapterCartScreen.ViewHolder>? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart_screen)

        val toolbar: Toolbar = findViewById(R.id.cart_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        supportActionBar?.setDisplayShowHomeEnabled(true)


        layoutManager = LinearLayoutManager(this)
        recyclerviewcartscreen.layoutManager = layoutManager

        adapter = RecyclerAdapterCartScreen()
        recyclerviewcartscreen.adapter = adapter


    }
}