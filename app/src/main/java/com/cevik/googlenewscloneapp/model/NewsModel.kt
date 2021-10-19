package com.cevik.googlenewscloneapp.model

import androidx.annotation.DrawableRes


data class NewsModel(
    @DrawableRes
    val picture: Int,
    val channelName: String,
    val topic: String,
    val date: String,
    val bigCard: Boolean = false
    )
