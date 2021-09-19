package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Interfaces.OnClick
import com.example.myapplication.databinding.ItemBinding

class RvAdapter(var list : ArrayList<Tarifs>  , var  Onclick : OnClick) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    inner class ViewHolder(item : View) :RecyclerView.ViewHolder(item) {
        var binding = ItemBinding.bind(item)
            fun onBind(tarif : Tarifs){
            binding.imageText.text = tarif.image
                binding.name.text = tarif.name
            binding.root.setOnClickListener {
                Onclick.onClick(tarif)
            }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}