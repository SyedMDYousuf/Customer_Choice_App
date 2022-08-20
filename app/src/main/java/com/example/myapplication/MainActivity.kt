package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler().postDelayed({
            val intent = Intent(this, StoreListScreen::class.java)
            startActivity(intent)
            finish()
        }, 2000)

        //val intnt = Intent(this,StoreListScreen::class.java)
        //startActivity(intnt)
    }
}