package com.example.layoutadnestedinrecyler_task3

import android.content.Context
import android.graphics.drawable.ClipDrawable.HORIZONTAL
import android.graphics.drawable.ClipDrawable.VERTICAL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutadnestedinrecyler_task3.adapter.Adapter

class MainActivity : AppCompatActivity() {
    private lateinit var context: Context
    var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        context = this
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView!!.layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        refreshAdapter(addStrings())
    }

    private fun refreshAdapter(items: ArrayList<String>) {
        val adapter = Adapter(context, items)
        recyclerView!!.adapter = adapter
    }

    private fun addStrings(): ArrayList<String> {
        val item = ArrayList<String>()
        for (i in 0..70) {
            item.add("Item $i")
        }
        return item
    }
}