package com.cevik.googlenewscloneapp.data

import com.cevik.googlenewscloneapp.R
import com.cevik.googlenewscloneapp.model.NewsModel

class MockDataGenerator {

    fun generateNewsList(count:Int):List<NewsModel> {
        var newsList = arrayListOf<NewsModel>()
        val bigCardModel = NewsModel(
          picture = R.drawable.ic_launcher_background,
            channelName = "HaberTürk",
            topic = "ZABANALASDLASDLASDLSAD",
            date = "34 dk önce",
            bigCard = true
        )
        val smallCardModel = NewsModel(
            picture = R.drawable.ic_launcher_background,
            channelName = "Fox",
            topic = "ASDASDASDASDASDSA",
            date = "1 saat önce",
            bigCard = false
        )
        repeat(count){
            when(it){
                1,7->{
                    newsList.add(bigCardModel)
                }
                else->{
                    newsList.add(smallCardModel)
                }
            }
        }
        return newsList


    }
}