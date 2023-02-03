package com.example.myapplication.notes

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NotesDao {

    @Insert
    suspend fun addNotes(notes: Notes);

    @Delete
   suspend fun  deleteNotes(notes: Notes)

//   @Query()
//   fun getALlNotes():LiveData<LiveData<Notes>>


}