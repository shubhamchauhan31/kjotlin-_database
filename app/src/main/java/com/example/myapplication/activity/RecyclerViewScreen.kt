package com.example.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapter.NotesAdapter
import com.example.myapplication.databinding.ActivityRecyclerViewBinding
import com.example.myapplication.databinding.ActivityRecyclerViewScreenBinding
import com.example.myapplication.model.NotesModel
import com.example.myapplication.viewModel.NotesViewModel

class RecyclerViewScreen : AppCompatActivity() {
  private  lateinit var binding: ActivityRecyclerViewScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init(){
        binding=DataBindingUtil.setContentView(this,R.layout.activity_recycler_view_screen)
        binding.recyclerViewItemNotes.setHasFixedSize(true)
        binding.recyclerViewItemNotes.layoutManager=LinearLayoutManager(this)

        var notesList= listOf<NotesModel>(NotesModel("ABC"), NotesModel("CDE"))
        var adapter=NotesAdapter(notesList)
        binding.recyclerViewItemNotes.adapter=adapter
    }
}