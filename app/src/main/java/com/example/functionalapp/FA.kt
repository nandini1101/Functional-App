package com.example.functionalapp


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView

class FA : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fa)



        val andr=findViewById<CardView>(R.id.cardview1)

        andr.setOnClickListener{
            intent=Intent(applicationContext,FA1::class.java)
            startActivity(intent)
        }

        val web=findViewById<CardView>(R.id.cardview2)

        web.setOnClickListener{
            intent=Intent(applicationContext,FA2::class.java)
            startActivity(intent)
        }

        val ios=findViewById<CardView>(R.id.cardview3)

        ios.setOnClickListener{
            intent=Intent(applicationContext,FA3::class.java)
            startActivity(intent)
        }

        val ml=findViewById<CardView>(R.id.cardview4)

        ml.setOnClickListener{
            intent=Intent(applicationContext,FA4::class.java)
            startActivity(intent)
        }

        val blockchain=findViewById<CardView>(R.id.cardview5)

        blockchain.setOnClickListener{
            intent=Intent(applicationContext,FA5::class.java)
            startActivity(intent)
        }

        val datasci=findViewById<CardView>(R.id.cardview6)

        datasci.setOnClickListener{
            intent=Intent(applicationContext,FA6::class.java)
            startActivity(intent)
        }
    }
}