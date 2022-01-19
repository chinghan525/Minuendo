package com.soundbrenner.minuendo.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.soundbrenner.minuendo.R
import com.soundbrenner.minuendo.data.model.ReviewsModel


class HorizontalReviewAdapter(private val list: MutableList<ReviewsModel>) :
    RecyclerView.Adapter<HorizontalReviewAdapter.MyView>() {

    class MyView(view: View) : RecyclerView.ViewHolder(view) {
        var llStart: LinearLayout = view.findViewById(R.id.llStart)
        var tvUser: TextView = view.findViewById(R.id.tvUser)
        var tvComment: TextView = view.findViewById(R.id.tvComment)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        val itemView: View = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.recycler_item_review,
                parent,
                false
            )

        return MyView(itemView)
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        val listData = list[position]

        holder.tvUser.text = listData.reviewTitle
        holder.tvComment.text = listData.reviewText

        holder.llStart.removeAllViews()

        for (i in 1..listData.reviewStars) {
            val imageview = ImageView(holder.itemView.context).apply {
                setPadding(2, 0, 2, 0)
                layoutParams = LinearLayout.LayoutParams(60, 60)
            }
            Glide.with(holder.itemView.context)
                .load(R.drawable.ic_star)
                .into(imageview)

            holder.llStart.addView(imageview)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}