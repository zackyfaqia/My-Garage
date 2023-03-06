package com.dicoding.mycar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvBrand: TextView = findViewById(R.id.tv_item_brand)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val tvPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvRoles: TextView = findViewById(R.id.tv_item_role)

        val carBrand = intent.getStringExtra("Brand")
        val carDetail = intent.getStringExtra("Detail")
        val carPhoto = intent.getIntExtra("Photo", 1)
        val carRoles = intent.getStringExtra("Role")

        tvBrand.text = carBrand
        tvDetail.text = carDetail
        tvRoles.text = carRoles
        tvPhoto.setBackgroundResource(carPhoto)

    }
}