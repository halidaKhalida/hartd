package com.example.google.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.google.R
import com.example.google.model.Search

class SearchAdapter(val list:ArrayList<Search>):RecyclerView.Adapter<SearchAdapter.SearchViewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewholder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_search, parent, false)
        return SearchViewholder(view)
    }

    override fun getItemCount()=list.size


    override fun onBindViewHolder(holder: SearchViewholder, position: Int) {
        val searched=list[position]
        holder.apply {
            ivSearched.setImageResource(searched.image)
            tvSearched.text=searched.text
        }
    }
    class SearchViewholder(view:View):RecyclerView.ViewHolder(view){
        val ivSearched=view.findViewById<ImageView>(R.id.iv_search)
        val tvSearched=view.findViewById<TextView>(R.id.tv_searched)
    }
}