package com.cevik.googlenewscloneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.cevik.googlenewscloneapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding=DataBindingUtil.setContentView<ActivityDetailBinding>(this,R.layout.activity_detail)


        binding.detailChannelName.text=intent.getStringExtra("name")
        binding.detailTopic.text=intent.getStringExtra("detaiTopic")
        binding.detailNews.text=intent.getStringExtra("detail")

        setSupportActionBar(binding.detailToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}