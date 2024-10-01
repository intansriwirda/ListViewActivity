package com.intan.listviewactiviy11

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.intan.listviewactiviy11.adapter.BukuAdapter
import com.intan.listviewactiviy11.model.ModelBuku

class RecycleViewActivity : AppCompatActivity() {

    private lateinit var rv_data: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        rv_data = findViewById(R.id.rv_data)

// Define array data
        val listBuku = listOf(
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "Intan sriwirda"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "jaya"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "intan sriwirda"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "Jaya"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "Intan sriwirda"),
        )
        val nBukuAdapter = BukuAdapter(listBuku)
        rv_data.apply {
            layoutManager= LinearLayoutManager(this@RecycleViewActivity)
            adapter = nBukuAdapter
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}