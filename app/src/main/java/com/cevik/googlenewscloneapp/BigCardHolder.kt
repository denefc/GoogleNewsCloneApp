package com.cevik.googlenewscloneapp

import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.cevik.googlenewscloneapp.model.NewsModel


class BigCardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(model: NewsModel, position: Int, onItemClickListener: (NewsModel) -> Unit) {

        val tvIndex = itemView.findViewById<TextView>(R.id.bgTvIndex)
        val tvImage = itemView.findViewById<ImageView>(R.id.bgTvImage)
        val tvName = itemView.findViewById<TextView>(R.id.bgTvChannelName)
        val tvTopic = itemView.findViewById<TextView>(R.id.bgTvTopic)
        val tvDate = itemView.findViewById<TextView>(R.id.bgTvDate)


        tvIndex.text = (position+1).toString()
        tvImage.setImageResource(model.picture)
        tvName.text = model.channelName
        tvTopic.text = model.topic
        tvDate.text = model.date


        val clContainer = itemView.findViewById<ConstraintLayout>(R.id.bgClContainer)









        clContainer.setOnClickListener {
            onItemClickListener.invoke(model)
        }

    }


}