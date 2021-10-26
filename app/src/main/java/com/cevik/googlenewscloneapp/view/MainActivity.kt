package com.cevik.googlenewscloneapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView

import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cevik.googlenewscloneapp.adapter.NewsListAdapter
import com.cevik.googlenewscloneapp.R
import com.cevik.googlenewscloneapp.databinding.ActivityMainBinding
import com.cevik.googlenewscloneapp.model.NewsModel
import com.cevik.googlenewscloneapp.network.ApiUtils
import com.cevik.googlenewscloneapp.response.NewsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
     var newsList:ArrayList<NewsModel> = arrayListOf()
    private lateinit var tempArrList:ArrayList<NewsModel>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

         binding= DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_main
        )


        getNews()

        binding.covid.setOnClickListener {
            val intent=Intent(this, CovidActivity::class.java)
            startActivity(intent)

        }

    }
    private fun getNews(){
        ApiUtils.newsDAOInterfaceget().getNews().enqueue(
            object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    val tempList=response.body()?.news
                    tempList?.let{
                     newsList= it as ArrayList<NewsModel>
                    }
                    val adapter= NewsListAdapter{ newsModel ->
                        val intent= Intent(this@MainActivity, DetailActivity::class.java).apply {
                            putExtra("name",newsModel.source.name)
                            putExtra("detailTopic",newsModel.title)
                            putExtra("detail",newsModel.content)
                            putExtra("detailImage",newsModel.image)
                        }
                        startActivity(intent)
                    }
                    adapter.newsList=newsList
                    binding.rvList.adapter=adapter
                    binding.rvList.layoutManager= LinearLayoutManager(this@MainActivity,RecyclerView.VERTICAL,false)


                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            }
        )
    }



}


