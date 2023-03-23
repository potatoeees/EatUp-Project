package com.example.eatup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BeourpartnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beourpartner)

        val homebtn: TextView = findViewById(R.id.homebtn)
        homebtn.setOnClickListener {
            val intent = Intent(this,Homepage1Activity::class.java)
            startActivity(intent)
        }

        val howtousebtn: TextView =findViewById(R.id.howtousebtn)
        howtousebtn.setOnClickListener {
            val intent= Intent(this,HowtouseActivity::class.java)
            startActivity(intent)
        }

        val contactusbtn: TextView = findViewById(R.id.contactusbtn)
        contactusbtn.setOnClickListener {
            val intent = Intent(this,ContactusActivity::class.java)
            startActivity(intent)
        }

        val joinnowwhite: Button = findViewById(R.id.joinnowwhite)
        joinnowwhite.setOnClickListener {
            val intent= Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}