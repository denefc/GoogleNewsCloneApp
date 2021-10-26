package com.cevik.googlenewscloneapp.network

import com.cevik.googlenewscloneapp.response.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface NewsDAOInterface {
    @GET("everything?q=Apple&from=2021-10-26&sortBy=popularity&apiKey=00fbe46e6c2d4253b6b772ac460d4ceb")
    fun getNews(): Call<NewsResponse>

}