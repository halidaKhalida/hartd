package com.example.google

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.google.adapter.DiscoverAdapter
import com.example.google.adapter.SearchAdapter
import com.example.google.model.Discover
import com.example.google.model.Search

class MainActivity:AppCompatActivity() {
    lateinit var searchList:ArrayList<Search>
    lateinit var discoverList: ArrayList<Discover>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        elaodLidr()

    }

    private fun initViews() {
        loadList()

        val rvSearch= findViewById<RecyclerView>(R.id.rv_search)
        rvSearch.layoutManager=LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rvSearch.adapter=SearchAdapter(list =searchList)
    }



    private fun loadList() {
        searchList=ArrayList()
        searchList.add(Search(R.drawable.baseline_search_24, "android intent"))
        searchList.add(Search(R.drawable.younube_icon, "Youtube"))
        searchList.add(Search(R.drawable.baseline_search_24, "android intent"))
        searchList.add(Search(R.drawable.younube_icon, "Youtube"))
        searchList.add(Search(R.drawable.baseline_search_24, "android intent"))
        searchList.add(Search(R.drawable.younube_icon, "Youtube"))
        searchList.add(Search(R.drawable.baseline_search_24, "android intent"))
        searchList.add(Search(R.drawable.younube_icon, "Youtube"))
        searchList.add(Search(R.drawable.baseline_search_24, "android intent"))
        searchList.add(Search(R.drawable.younube_icon, "Youtube"))


    }
    private fun elaodLidr(){
        loadDiscovery()
        val rvDiscover=findViewById<RecyclerView>(R.id.rv_discover)
        rvDiscover.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true)
        rvDiscover.adapter=DiscoverAdapter(liste = discoverList)
    }
    private fun loadDiscovery() {
        discoverList= ArrayList()
        discoverList.add(Discover(R.drawable.parrot,"Солнечный Ара стал вымирающим видом попугаев на Земле. Был занесен в красную книгу."))
        discoverList.add(Discover(R.drawable.img,"Yellow Ara"))
        discoverList.add(Discover(R.drawable.parrot,"Солнечный Ара стал вымирающим видом на Земле. Был занесен в красную книгу."))
        discoverList.add(Discover(R.drawable.parrot,"Солнечный Ара стал вымирающим видом на Земле. Был занесен в красную книгу."))
        discoverList.add(Discover(R.drawable.parrot,"Солнечный Ара стал вымирающим видом на Земле. Был занесен в красную книгу."))
        discoverList.add(Discover(R.drawable.parrot,"Солнечный Ара стал вымирающим видом на Земле. Был занесен в красную книгу."))
        discoverList.add(Discover(R.drawable.parrot,"Солнечный Ара стал вымирающим видом на Земле. Был занесен в красную книгу."))

    }

}