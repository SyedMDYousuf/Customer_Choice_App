package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.transition.Visibility
import kotlinx.android.synthetic.main.activity_login_screen.*

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        val toolbar: Toolbar = findViewById(R.id.login_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        supportActionBar?.setDisplayShowHomeEnabled(true)


        initUi()
    }

    fun initUi(){
        login_phone.setOnClickListener{
            login_phone.visibility = View.GONE
            phnnumber.visibility = View.VISIBLE
            click_next.visibility = View.VISIBLE
        }
        click_next.setOnClickListener {
            click_next.visibility = View.GONE
            click_next2.visibility = View.VISIBLE
            phnnumber.visibility = View.GONE
            otp_num.visibility = View.VISIBLE
            tv_mobile_no.text = "Mobile Number : ${phnnumber.text}"
            tv_mobile_no.visibility = View.VISIBLE
        }
        click_next2.setOnClickListener {
            click_next2.visibility = View.GONE
            otp_num.visibility = View.GONE
            submit.visibility = View.VISIBLE
            name.visibility = View.VISIBLE
        }
        submit.setOnClickListener {
            val intent = Intent(this,MyAccountScreen::class.java)
            startActivity(intent)
        }
    }
}