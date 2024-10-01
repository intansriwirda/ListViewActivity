package com.intan.listviewactiviy11

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.intan.listviewactiviy11.adapter.MovieAdapter
import com.intan.listviewactiviy11.model.Mocklist1
import com.intan.listviewactiviy11.model.ModelMovie

class RecycleMovieActivity : AppCompatActivity() {
    private lateinit var rv_movie :RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_movie)

        rv_movie = findViewById(R.id.rv_movie)

        rv_movie.layoutManager = GridLayoutManager(this, 2)
        val adapter = MovieAdapter(Mocklist1.getmodel()as ArrayList<ModelMovie> , this)
        rv_movie.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}