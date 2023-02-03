package com.example.myapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.notes.Notes
import com.example.myapplication.notes.NotesDao
import com.example.myapplication.notes.NotesDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NotesViewModel(private val notes: NotesDao):ViewModel() {
//    fun getNotes():LiveData<List<Notes>>{
//        return
//    }

    fun addNotes(n: Notes){
        viewModelScope.launch(Dispatchers.IO){
            notes.addNotes(n)
        }

    }
}