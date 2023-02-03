package com.example.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityQuizActivtyBinding

class QuizActivty : AppCompatActivity() {
    private lateinit var quizActivtyBinding: ActivityQuizActivtyBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        quizActivtyBinding=DataBindingUtil.setContentView(this,R.layout.activity_quiz_activty)
        init()
    }

    private fun init(){

    }
}