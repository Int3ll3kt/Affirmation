package com.int3ll3kt.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.int3ll3kt.recyclerview.adapter.ItemAdapter
import com.int3ll3kt.recyclerview.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.layoutManager =GridLayoutManager(this, 2)
        recyclerView.adapter = ItemAdapter(this, Datasource().loadAffirmations())



    }


}