package com.example.chtigatpclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_student2.*

class DetailStudentActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_student2)

        var getDataDetail = intent.getSerializableExtra("detailStudent") as ListStudent
        iv_image.setImageResource(getDataDetail.img)
        tv_nama.text = getDataDetail.nama
        tv_nim.text = getDataDetail.nim

    }
}