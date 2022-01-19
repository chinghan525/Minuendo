package com.soundbrenner.minuendo.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.soundbrenner.minuendo.R


class HorizontalImagesAdapter(private val list: MutableList<String>) :
    RecyclerView.Adapter<HorizontalImagesAdapter.MyView>() {

    class MyView(view: View) : RecyclerView.ViewHolder(view) {
        var imageView: ImageView = view.findViewById(R.id.ivImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        val itemView: View = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.recycler_item_images,
                parent,
                false
            )

        return MyView(itemView)
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        val listData = list[position]

        Glide.with(holder.itemView.context)
            .load(listData)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}