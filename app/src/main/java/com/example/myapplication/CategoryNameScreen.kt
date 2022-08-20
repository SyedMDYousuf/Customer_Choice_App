package com.example.myapplication

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_category_name_screen.*
import kotlinx.android.synthetic.main.activity_product_name.*
import kotlinx.android.synthetic.main.activity_store_name_screen.*
import kotlinx.android.synthetic.main.card_layout_category.*

class CategoryNameScreen : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? =null
    private var adapter: RecyclerView.Adapter<RecyclerAdapterCategory.ViewHolder>? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_name_screen)

        add_cart3.setOnClickListener {
            val intent = Intent(this,CartScreen::class.java)
            startActivity(intent)
        }


        val toolbar: Toolbar = findViewById(R.id.category_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        setSupportActionBar(findViewById(R.id.category_toolbar))



        layoutManager = LinearLayoutManager(this)
        recyclerview_category.layoutManager = layoutManager

        adapter = RecyclerAdapterCategory(this)
        recyclerview_category.adapter = adapter

    }
}