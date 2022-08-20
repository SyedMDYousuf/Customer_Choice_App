package com.example.myapplication

import android.app.Person
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.style.ClickableSpan
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_store_list_screen.*
import android.service.autofill.OnClickAction as OnClickAction1


class StoreListScreen : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? =null
    private var adapter: RecyclerView.Adapter<RecylerAdapter.ViewHolder>? =null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_store_list_screen)

        add_cart1.setOnClickListener {
            val intent = Intent(this,CartScreen::class.java)
            startActivity(intent)


        }


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setSupportActionBar(findViewById(R.id.my_toolbar))




        layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = layoutManager

        adapter = RecylerAdapter(this)
        recyclerview.adapter = adapter




    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.person -> {
                val intent = Intent(this, LoginScreen::class.java)
                startActivity(intent)
            }

            R.id.notification -> {

                val intent= Intent(this,NotificationScreen::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }




    override fun onBackPressed() {
        finishAffinity()
        finish()
        super.onBackPressed()



    }



}