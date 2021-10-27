package com.cevik.googlenewscloneapp.network

import com.cevik.googlenewscloneapp.response.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface NewsDAOInterface {
    @GET("everything?q=Apple&from=2021-10-26&sortBy=popularity&apiKey={YOURAPİKEYSHOULDBEHERE}")
    fun getNews(): Call<NewsResponse>

}
