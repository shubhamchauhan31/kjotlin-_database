package com.example.myapplication.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "student")
data class Student(
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val name:String,
    val age:Int,
    val createDate:Date,
    val isPresent:Int


)
