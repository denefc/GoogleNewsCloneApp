package com.cevik.googlenewscloneapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cevik.googlenewscloneapp.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        supportActionBar?.hide()

        CoroutineScope(Dispatchers.Main).launch {
            delay(5000L)
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
            finish()
        }

    }
}