package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.NotesModel

class NotesAdapter(val nameList: List<NotesModel>): RecyclerView.Adapter<NotesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layout=LayoutInflater.from(parent.context).inflate(R.layout.custom_name_list,parent,false);
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var  item=nameList[position]
        holder.name.text=item.title;
    }

    override fun getItemCount(): Int {
        return nameList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name=itemView.findViewById<TextView>(R.id.my_notes_name)

    }
}