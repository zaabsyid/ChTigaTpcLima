package com.example.chtigatpclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_provinsi.*

class ProvinsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_provinsi)

        val listProvinsi = arrayListOf(
            ListProvinsi("Provinsi : Nanggroe Aceh Darussalam", "Ibu kota : Banda Aceh", R.drawable.rumah_adat_aceh),
            ListProvinsi("Provinsi : Jawa Tengah", "Ibu kota : Semarang", R.drawable.rumah_adat_jawa_tengah),
            ListProvinsi("Provinsi : Yogyakarta", "Ibu kota : Yogyakarta", R.drawable.rumah_adat_jogyakarta),
            ListProvinsi("Provinsi : Bengkulu", "Ibu kota : Bengkulu", R.drawable.rumah_adat_bengkulu),
            ListProvinsi("Provinsi : Banten", "Ibu kota : Serang", R.drawable.rumah_adat_banten),
            ListProvinsi("Provinsi : DKI Jakarta", "Ibu kota : Jakarta", R.drawable.rumah_adat_jakarta),
            ListProvinsi("Provinsi : Jambi", "Ibu kota : Jambi", R.drawable.rumah_adat_jambi),
            ListProvinsi("Provinsi : Riau", "Ibu kota : Pekanbaru", R.drawable.rumah_adat_riau),
            ListProvinsi("Provinsi : Gorontalo", "Ibu kota : Gorontalo", R.drawable.rumah_adat_gorontalo),
            ListProvinsi("Provinsi : Bali", "Ibu kota : Bali", R.drawable.rumah_adat_bali),
        )

        var adapterProvinsi = ProvinsiAdapter(listProvinsi)
        var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_provinsi.layoutManager = linearLayout
        rv_provinsi.adapter = adapterProvinsi
    }
}