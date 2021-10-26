package com.cevik.googlenewscloneapp.response

import com.cevik.googlenewscloneapp.model.NewsModel
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("articles")@Expose var news:List<NewsModel>,
    @SerializedName("status")@Expose var status:String,
    @SerializedName("totalResults")@Expose var totalResults:Int
)