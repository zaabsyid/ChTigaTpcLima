package com.example.chtigatpclima

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class StudentAdapterDiffUtil() : RecyclerView.Adapter<StudentAdapterDiffUtil.ViewHolder>() {

// step 1
    private var diffCallBack = object : DiffUtil.ItemCallback<ListStudent>(){
        override fun areItemsTheSame(oldItem: ListStudent, newItem: ListStudent): Boolean {
            return oldItem.nim == newItem.nim
        }

        override fun areContentsTheSame(oldItem: ListStudent, newItem: ListStudent): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }
// step 2
    var differ = AsyncListDiffer(this, diffCallBack)

// step 3
    fun submitData(value: ArrayList<ListStudent>){
        differ.submitList(value)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var nama = itemView.findViewById<TextView>(R.id.tv_nama)
        var nim = itemView.findViewById<TextView>(R.id.tv_nim)
        var img = itemView.findViewById<ImageView>(R.id.iv_student)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapterDiffUtil.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: StudentAdapterDiffUtil.ViewHolder, position: Int) {
        var data = differ.currentList[position]
        holder.nama.text = data.nama
        holder.nim.text = data.nim
        holder.img.setImageResource(data.img)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}