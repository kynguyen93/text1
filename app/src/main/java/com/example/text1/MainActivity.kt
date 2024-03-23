package com.example.text1

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ánh xạ các thành phần từ layout
        val animatedImage = findViewById<ImageView>(R.id.animated_image)
        val movingText = findViewById<TextView>(R.id.moving_text)

        // Tạo animation cho movingText
        val animation = TranslateAnimation(
            Animation.RELATIVE_TO_PARENT, 0f,
            Animation.RELATIVE_TO_PARENT, 0f,
            Animation.RELATIVE_TO_PARENT, 0f,
            Animation.RELATIVE_TO_PARENT, 0.5f
        ) // Di chuyển text từ dưới lên trên
        animation.setDuration(3000) // Thời gian di chuyển (ms)
        animation.setRepeatCount(Animation.INFINITE) // Lặp vô hạn
        movingText.startAnimation(animation)
    }
}