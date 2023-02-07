package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.db.Student
import com.example.myapplication.db.StudentDatabase
import com.example.myapplication.viewModel.MainViewModel
import com.example.myapplication.viewModel.MainViewModelProvider
import com.google.android.material.button.MaterialButton
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var tvNo: TextView;
    private lateinit var btn:MaterialButton;
    private lateinit var img:ImageView
    private lateinit var mainBinding: ActivityMainBinding;
    private lateinit var mainViewModel: MainViewModel;
    var count=0;

    private lateinit var database: StudentDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        init()
    }
    fun init(){
//        tvNo=findViewById(R.id.textView);
//        btn=findViewById(R.id.dice_through)
//        img=findViewById(R.id.dice_image)
        mainViewModel=ViewModelProvider(this,MainViewModelProvider(5)).get(MainViewModel::class.java)

//        mainViewModel.text.observe(this,{
//            mainBinding.textView.text=it.toString();
//        })
//
//        mainViewModel.btnText.observe(this,{text->
//            mainBinding.diceThrough.text=text.toString()
//        })

//        mainBinding.diceThrough.setOnClickListener { mainViewModel.updateText() }
        mainBinding.mainView=mainViewModel
        mainBinding.lifecycleOwner=this

        database=Room.databaseBuilder(applicationContext,StudentDatabase::class.java,"studentDB").build();

//        GlobalScope.launch { database.studentDao().addStudent(Student(0,"Shubham",25,"",1)) }

    }




    private fun setText(){
//        mainBinding.textView.text=count.toString();
        mainBinding.textView.text=mainViewModel.count.toString();
        diceRoll()

    }


    private fun incrementOrder(){
//        count++;
        mainViewModel.increment();
        setText();
    }
    private fun diceRoll(){
        val randomNumber=(1..6).random();
        mainBinding.textView.setText(randomNumber.toString())

      val diceIconm  =when(randomNumber){
            1->R.drawable.dice_one
            2->R.drawable.dice_two
            3->R.drawable.dice_three
            4->R.drawable.dice_four
            5->R.drawable.dice_five
            6->R.drawable.dice_six
          else -> R.drawable.empty_dice
      }
        mainBinding.diceImage.setImageResource(diceIconm)
    }
}