package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentHomeFragmentsBinding

class HomeFragments : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding=DataBindingUtil.inflate<FragmentHomeFragmentsBinding>(inflater,R.layout.fragment_home_fragments, container, false)
        init(binding)
        return binding.root
    }

    private fun init(binding: FragmentHomeFragmentsBinding){
        
    }


}