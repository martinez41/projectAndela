package com.tdms140.projectandela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ChooseOption : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_option)

        findViewById<ImageButton>(R.id.btn_teacher).setOnClickListener{
            val intent = Intent(this,Sign_In::class.java)
            startActivity(intent)
        }
    }
}