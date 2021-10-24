package com.cevik.googlenewscloneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import com.cevik.googlenewscloneapp.databinding.ActivityCovidBinding

class CovidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_covid)

        val binding=DataBindingUtil.setContentView<ActivityCovidBinding>(this,R.layout.activity_covid)
        setSupportActionBar(binding.covidToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}