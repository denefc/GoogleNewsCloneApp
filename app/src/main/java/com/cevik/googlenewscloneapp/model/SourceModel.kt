package com.cevik.googlenewscloneapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SourceModel(
    @SerializedName("id") @Expose var id:String,
    @SerializedName("name")@Expose var name:String
)
