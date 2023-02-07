package com.example.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.room.Room
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMyNotesBinding
import com.example.myapplication.notes.Notes
import com.example.myapplication.notes.NotesDatabase
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MyNotes : AppCompatActivity() {
    private lateinit var myNotesBinding: ActivityMyNotesBinding;
    private lateinit var notesDatabase: NotesDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       myNotesBinding=DataBindingUtil.setContentView(this,R.layout.activity_my_notes)
        init()
    }
    @OptIn(DelicateCoroutinesApi::class)
    private fun init(){
        notesDatabase=Room.databaseBuilder(applicationContext,NotesDatabase::class.java,"notesDB").build();
//        GlobalScope.launch( notesDatabase.notes().addNotes(Notes(1,myNotesBinding.myNotesName.text.toString())))

//        myNotesBinding.myNotesBtn.setOnClickListener {
//
//            GlobalScope.launch{notesDatabase.notes().addNotes(Notes(0,myNotesBinding.myNotesName.text.toString()))}
//
//        }
    }
}

