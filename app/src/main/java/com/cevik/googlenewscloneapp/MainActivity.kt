package com.cevik.googlenewscloneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cevik.googlenewscloneapp.data.MockDataGenerator
import com.cevik.googlenewscloneapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding= DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)


        val adapter=NewsListAdapter{ newsModel ->
            Toast.makeText(this,newsModel.channelName,Toast.LENGTH_LONG).show()
        }
        adapter.newsList=MockDataGenerator().generateNewsList(10)

        binding.rvList.adapter=adapter
        binding.rvList.layoutManager= LinearLayoutManager(this,RecyclerView.VERTICAL,false)


    }
}