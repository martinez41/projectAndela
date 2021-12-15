package com.tdms140.projectandela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val handler = Handler()
        Handler().postDelayed({
            val intent = Intent(this,Sign_In::class.java)
            startActivity(intent)
        },2000)
    }
}