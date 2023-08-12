package com.example.google.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.google.R
import com.example.google.model.Discover

class DiscoverAdapter(val liste:ArrayList<Discover>): RecyclerView.Adapter<DiscoverAdapter.DiscoverViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscoverViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_search, parent, false)
        return DiscoverAdapter.DiscoverViewHolder(view)
    }

    override fun getItemCount()=liste.size



    override fun onBindViewHolder(holder: DiscoverViewHolder, position: Int) {
        val searched=liste[position]
        holder.apply {
            ivParrot.setImageResource(searched.image)
            tvNews.text=searched.text
        }
    }
    class DiscoverViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val ivParrot=view.findViewById<ImageView>(R.id.iv_parrot)
        val tvNews=view.findViewById<TextView>(R.id.tv_news)

    }
}