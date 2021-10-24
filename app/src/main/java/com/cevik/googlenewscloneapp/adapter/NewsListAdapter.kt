package com.cevik.googlenewscloneapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cevik.googlenewscloneapp.R
import com.cevik.googlenewscloneapp.model.NewsModel
import com.cevik.googlenewscloneapp.model.NewsType

class NewsListAdapter(private val onItemClickListener:(NewsModel)->Unit):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var newsList:List<NewsModel> = arrayListOf()
    set(value) {
        field=value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewHolder=when(viewType){
           NewsType.BIG_CARD_TYPE.value->{
                val itemView= LayoutInflater.from(parent.context)
                    .inflate(R.layout.adapter_item_big_card,parent,false)
                BigCardHolder(itemView)
            }
            else->{
                val itemView= LayoutInflater.from(parent.context)
                    .inflate(R.layout.adapter_item_small_card,parent,false)
                SmallCardHolder(itemView)
            }
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(newsList[position].bigCard){
            true-> (holder as BigCardHolder).bind(newsList[position],position,onItemClickListener)
            false-> (holder as SmallCardHolder).bind(newsList[position],position,onItemClickListener)

        }

    }

    override fun getItemCount(): Int =newsList.size

    override fun getItemViewType(position: Int): Int {
        return when(newsList[position].bigCard){
            true ->NewsType.BIG_CARD_TYPE.value
            false ->NewsType.SMALL_CARD_TYPE.value
        }
    }
}