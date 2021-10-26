package com.cevik.googlenewscloneapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class NewsModel (
    @SerializedName("source")@Expose var source:SourceModel,
    @SerializedName("author") @Expose var author:String,
    @SerializedName("title")@Expose var title:String,
    @SerializedName("description")@Expose var description:String,
    @SerializedName("urlToImage")@Expose var image:String,
    @SerializedName("publishedAt")@Expose var published:String,
    @SerializedName("content")@Expose var content:String)
    : Serializable
