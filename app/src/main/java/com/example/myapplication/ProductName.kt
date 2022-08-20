package com.example.myapplication

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_product_name.*

class ProductName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_name)

        card_v_prd_price2.setPaintFlags(card_v_prd_price2.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)

        add_cart4.setOnClickListener {
            val intent = Intent(this,CartScreen::class.java)
            startActivity(intent)
        }


        val toolbar: Toolbar = findViewById(R.id.product_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        supportActionBar?.setDisplayShowHomeEnabled(true)

    }
}