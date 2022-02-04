package com.android.activitytransition

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val imgView = findViewById<ImageView>(R.id.iv_logo)


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            val activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, imgView, imgView.transitionName)
            startActivity(intent, activityOptions.toBundle())

        }, 1500)
    }
}