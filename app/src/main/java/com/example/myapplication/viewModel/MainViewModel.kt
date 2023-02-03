package com.example.myapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(val intValue: Int) :ViewModel() {
    var text=MutableLiveData<String>();
    var btnText=MutableLiveData<String>();
    init {
        text.value="Hi I Java Developer"
        btnText.value="Done"
    }



    var count=intValue;
    fun increment(){
        count++
    }

    fun updateText(){

        text.value="Now i am Kotlin Developer"
        btnText.value="Correct"

    }
}