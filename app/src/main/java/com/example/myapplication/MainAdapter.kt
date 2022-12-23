package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(val friends:List<Friends>): RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameTextView: TextView = itemView.findViewById(R.id.name)
        val stepsTextView: TextView = itemView.findViewById(R.id.steps)
        val avatarImageView: ImageView = itemView.findViewById(R.id.avatar)
        val medalImageView: ImageView = itemView.findViewById(R.id.medal)
        val numberTextView: TextView= itemView.findViewById(R.id.number)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.card, parent, false)
        return ViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTextView.text = friends[position].name
        val number=position+1
        holder.numberTextView.text ="$number"
        val steps=friends[position].steps
        holder.stepsTextView.text = "$steps шагов"
        holder.avatarImageView.setImageResource(friends[position].avatar)
        when (friends[position].score){
            0-> holder.medalImageView.isInvisible
            1->{holder.medalImageView.setImageResource(R.drawable.firstplace)
                holder.medalImageView.isVisible}
            2->{holder.medalImageView.setImageResource(R.drawable.secondplace)
                holder.medalImageView.isVisible}
            3->{holder.medalImageView.setImageResource(R.drawable.thirdplace)
                holder.medalImageView.isVisible}
        }


    }

    override fun getItemCount(): Int {
        return friends.size
    }


}