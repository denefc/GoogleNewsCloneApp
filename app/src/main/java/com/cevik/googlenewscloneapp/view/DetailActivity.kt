package com.cevik.googlenewscloneapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.cevik.googlenewscloneapp.R
import com.cevik.googlenewscloneapp.databinding.ActivityDetailBinding
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding=DataBindingUtil.setContentView<ActivityDetailBinding>(this,
            R.layout.activity_detail
        )


        binding.detailChannelName.text=intent.getStringExtra("name")
        binding.detailTopic.text=intent.getStringExtra("detailTopic")
        binding.detailNews.text=intent.getStringExtra("detail")
        val imageString=intent.getStringExtra("detailImage")
        Picasso.get().load(imageString).into(binding.detailImage)

        setSupportActionBar(binding.detailToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}