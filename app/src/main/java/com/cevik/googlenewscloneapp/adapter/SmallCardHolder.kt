package com.cevik.googlenewscloneapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cevik.googlenewscloneapp.R
import com.cevik.googlenewscloneapp.model.NewsModel
import com.squareup.picasso.Picasso

class SmallCardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(model: NewsModel, position: Int, onItemClickListener: (NewsModel) -> Unit) {


        val tvIndex = itemView.findViewById<TextView>(R.id.tvIndex)
        val tvImage = itemView.findViewById<ImageView>(R.id.tvImage)
        val tvName = itemView.findViewById<TextView>(R.id.tvChannelName)
        val tvTopic = itemView.findViewById<TextView>(R.id.tvTopic)
        val tvDate = itemView.findViewById<TextView>(R.id.tvDate)


        tvIndex.text = (position+1).toString()
        Picasso.get().load(model.image).into(tvImage)
        tvName.text=model.author
        tvTopic.text=model.title
        tvDate.text=model.published


        val lnContainer = itemView.findViewById<LinearLayout>(R.id.lnContainer)






        lnContainer.setOnClickListener {
            onItemClickListener.invoke(model)
        }
    }


}