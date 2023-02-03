package com.example.myapplication.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDao {

    @Insert
    suspend fun addStudent(student: Student);

    @Delete
    suspend fun delStudent(student: Student)

//    @Query("SELECT * FROM student")
//    fun getAllStudent():LiveData<List<String>>
}