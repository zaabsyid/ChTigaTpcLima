package com.example.chtigatpclima

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProvinsiAdapter(val listProvinsi: ArrayList<ListProvinsi>): RecyclerView.Adapter<ProvinsiAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var namaProvinsi = view.findViewById<TextView>(R.id.tv_nama_provinsi)
        var namaIbukota = view.findViewById<TextView>(R.id.tv_nama_ibukota)
        var imgGambarRumah = view.findViewById<ImageView>(R.id.iv_gambar_rumah_adat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProvinsiAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_provinsi, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ProvinsiAdapter.ViewHolder, position: Int) {
        holder.namaProvinsi.text = listProvinsi[position].namaProvinsi
        holder.namaIbukota.text = listProvinsi[position].namaIbukota
        holder.imgGambarRumah.setImageResource(listProvinsi[position].imgRumah)
    }

    override fun getItemCount(): Int {
        return listProvinsi.size
    }
}