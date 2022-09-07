package com.example.chtigatpclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listStudent = arrayListOf(
            ListStudent("Zahir", "6546565656", R.drawable.ic_launcher_foreground),
            ListStudent("Iqbal", "5675453455", R.drawable.ic_launcher_foreground),
            ListStudent("Dwika", "3453467575", R.drawable.ic_launcher_foreground),
            ListStudent("Rois", "6565464556", R.drawable.ic_launcher_foreground),
            ListStudent("Syifa", "5465465444", R.drawable.ic_launcher_foreground)
        )

        var adapterStudent = StudentAdapter(listStudent)
        var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_student.layoutManager = linearLayout
        rv_student.adapter = adapterStudent
    }
}