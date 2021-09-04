package com.guychokalolo.mini_app_firebase_skateboard.presentation.main.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.guychokalolo.mini_app_firebase_skateboard.databinding.ItemHomeUpBinding

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = ItemHomeUpBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class HomeViewHolder(private val binding: ItemHomeUpBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}