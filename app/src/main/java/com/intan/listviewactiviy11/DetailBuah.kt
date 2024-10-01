package com.intan.listviewactiviy11

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailBuah : AppCompatActivity() {
    private lateinit var txtdetailbuah : TextView
    private lateinit var txtdetailokasi : TextView
    private lateinit var txtdetaildesk : TextView
    private lateinit var imgdetailbuah : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        txtdetailbuah = findViewById(R.id.txtdetailbuah)
        imgdetailbuah = findViewById(R.id.imgdetailbuah)
        txtdetailokasi = findViewById(R.id.txtdetaillokasi)
        txtdetaildesk = findViewById(R.id.txtdetaildesk)


        //get data dari intent
        val detailTeks = intent.getStringExtra("nama")
        val detaillokasi = intent.getStringExtra("lokasi")
        val detaildesk = intent.getStringExtra("deskripsi")
        val detailImg = intent.getIntExtra("image",0)

        //set data ke widget
        txtdetailbuah.setText(detailTeks)
        txtdetailokasi.setText(detaillokasi)
        txtdetaildesk.setText(detaildesk)
        imgdetailbuah.setImageResource(detailImg)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}