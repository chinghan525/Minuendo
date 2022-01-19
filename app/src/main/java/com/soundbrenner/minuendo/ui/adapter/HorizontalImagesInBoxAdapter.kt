package com.soundbrenner.minuendo.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.soundbrenner.minuendo.R
import com.soundbrenner.minuendo.data.model.ImageInBox


class HorizontalImagesInBoxAdapter(private val list: MutableList<ImageInBox>) :
    RecyclerView.Adapter<HorizontalImagesInBoxAdapter.MyView>() {

    class MyView(view: View) : RecyclerView.ViewHolder(view) {
        var imageView: ImageView = view.findViewById(R.id.ivImage)
        var tvItem: TextView = view.findViewById(R.id.tvItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        val itemView: View = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.recycler_item_images_in_box,
                parent,
                false
            )

        return MyView(itemView)
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        val listData = list[position]

        Glide.with(holder.itemView.context)
            .load(listData.imageUrl)
            .into(holder.imageView)

        holder.tvItem.text = listData.itemName
    }

    override fun getItemCount(): Int {
        return list.size
    }

}