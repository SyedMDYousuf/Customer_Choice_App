package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_store_list_screen.*
import kotlinx.android.synthetic.main.activity_store_name_screen.*

class StoreNameScreen : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? =null
    private var adapter: RecyclerView.Adapter<RecyclerAdapterStore.ViewHolder>? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_name_screen)

        add_cart2.setOnClickListener {
            val intent = Intent(this, CartScreen::class.java)
            startActivity(intent)
        }




        val toolbar: Toolbar = findViewById(R.id.store_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        supportActionBar?.setDisplayShowHomeEnabled(true)



        layoutManager = LinearLayoutManager(this)
        recyclerviewstorename.layoutManager = layoutManager

        adapter = RecyclerAdapterStore(this)
        recyclerviewstorename.adapter = adapter



    }
}