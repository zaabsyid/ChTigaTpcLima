package com.example.chtigatpclima

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(val listStudent: ArrayList<ListStudent>): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    var onClick : ((ListStudent) -> Unit)? = null

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var namaStudent = view.findViewById<TextView>(R.id.tv_nama)
        var nimStudent = view.findViewById<TextView>(R.id.tv_nim)
        var imgStudent = view.findViewById<ImageView>(R.id.iv_student)
        var cardView = view.findViewById<CardView>(R.id.cardView_student)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].nama
        holder.nimStudent.text = listStudent[position].nim
        holder.imgStudent.setImageResource(listStudent[position].img)
        holder.cardView.setOnClickListener{
            onClick?.invoke(listStudent[position])
        }
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }
}