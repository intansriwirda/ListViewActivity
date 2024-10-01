package com.intan.listviewactiviy11

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var  btnBuku : Button
    private lateinit var btnBuah : Button
    private lateinit var btnMovie : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnBuku = findViewById(R.id.btnBuku)
        btnBuah = findViewById(R.id.btnBuah)
        btnMovie = findViewById(R.id.btnmovie)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnBuku.setOnClickListener(){
            val intent = Intent(this@MainActivity, RecycleViewActivity::class.java)
            startActivity(intent)
        }

        btnBuah.setOnClickListener(){
            val intent = Intent(this@MainActivity, RecycleBuahActivity::class.java)
            startActivity(intent)
        }

        btnMovie.setOnClickListener(){
            val intent = Intent(this@MainActivity, RecycleMovieActivity::class.java)
            startActivity(intent)
        }
    }
}
