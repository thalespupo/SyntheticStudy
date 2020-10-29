package com.thalespupo.syntheticstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val adapter = MyAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        adapter.submitList(bigList)
    }
}

val bigList = listOf(
    "Loren1",
    "Loren2",
    "Loren3",
    "Loren4",
    "Loren5",
    "Loren6",
    "Loren1",
    "Loren2",
    "Loren3",
    "Loren4",
    "Loren5",
    "Loren6",
    "Loren1",
    "Loren2",
    "Loren3",
    "Loren4",
    "Loren5",
    "Loren6",
    "Loren1",
    "Loren2",
    "Loren3",
    "Loren4",
    "Loren5",
    "Loren6",
    "Loren1",
    "Loren2",
    "Loren3",
    "Loren4",
    "Loren5",
    "Loren6",
    "Loren1",
    "Loren2",
    "Loren3",
    "Loren4",
    "Loren5",
    "Loren6",
    "Loren1",
    "Loren2",
    "Loren3",
    "Loren4",
    "Loren5",
    "Loren6",
    "Loren1",
    "Loren2",
    "Loren3",
    "Loren4",
    "Loren5",
    "Loren6"
)