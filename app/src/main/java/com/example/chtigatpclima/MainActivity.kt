package com.example.chtigatpclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapterStudentdiff : StudentAdapterDiffUtil

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

        adapterStudent.onClick = {
            var pindah = Intent(this,DetailStudentActivity2::class.java)
            pindah.putExtra("detailStudent",it)
            startActivity(pindah)
        }

        btn_update_tanpa_diff.setOnClickListener{
            listStudent[3] = ListStudent("update Rois","11111",R.drawable.rumah_adat_banten)
            adapterStudent = StudentAdapter(listStudent)
            rv_student.adapter= adapterStudent
            adapterStudent.notifyDataSetChanged()
        }

        btn_update_diff.setOnClickListener {
//            val list: MutableList<ListStudent> = listStudent.toMutableList()
            listStudent[1] = ListStudent("Update Titi", "123456789", R.drawable.rumah_adat_aceh)
            adapterStudentdiff = StudentAdapterDiffUtil()
            adapterStudentdiff.submitData(listStudent)
            rv_student.adapter = adapterStudentdiff
        }
    }
}