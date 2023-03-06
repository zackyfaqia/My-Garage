package com.dicoding.mycar

import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCarAdapter(private val listCar: ArrayList<Car>, private val context: Context): RecyclerView.Adapter<ListCarAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_car, parent, false)
        return ListViewHolder(view)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindItem(listCar[position])
        holder.itemView.setOnClickListener{
            val getData = listCar.get(position)
            val getBrand: String = getData.brand
            val getDetail: String = getData.detail
            val getPhoto: Int = getData.photo
            val getRole: String = getData.role

            val moveToDetail = Intent(context, DetailActivity::class.java)
            moveToDetail.putExtra("Brand", getBrand)
            moveToDetail.putExtra("Detail", getDetail)
            moveToDetail.putExtra("Photo", getPhoto)
            moveToDetail.putExtra("Role", getRole)
            context.startActivity(moveToDetail)
            //Toast.makeText(holder.itemView.context, "Kamu pilih "+listCar, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return listCar.size
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItem(car: Car) {
            var tvBrand: TextView = itemView.findViewById(R.id.tv_item_brand)
            var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
            var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

            tvBrand.text = car.brand
            tvDetail.text = car.detail
            imgPhoto.setImageResource(car.photo)
        }
    }
}