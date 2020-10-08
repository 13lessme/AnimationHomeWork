package com.example.animationmakafaka

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        But_Frame.setOnClickListener {
        startActivity(Intent(this, FrameAnimations::class.java))
        }
        But_Tween.setOnClickListener {
            startActivity(Intent(this, TweenAnimations::class.java))
        }
    }
}
