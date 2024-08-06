package com.example.myapp

import android.app.WallpaperManager
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.io.IOException

class MainActivity : AppCompatActivity() {
    lateinit var selectedImageView: ImageView
    lateinit var image1: ImageView
    lateinit var image2: ImageView
    lateinit var image3: ImageView
    lateinit var image4: ImageView
    lateinit var image5: ImageView
    lateinit var image6: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        selectedImageView = findViewById(R.id.selectedImageView)
        image1 = findViewById(R.id.image1)
        image2 = findViewById(R.id.image2)
        image3 = findViewById(R.id.image3)
        image4 = findViewById(R.id.image4)
        image5 = findViewById(R.id.image5)
        image6 = findViewById(R.id.image6)

        image1.setOnClickListener {
            selectedImageView.setImageDrawable(image1.drawable)
        }

        image2.setOnClickListener {
            selectedImageView.setImageDrawable(image2.drawable)
        }

        image3.setOnClickListener {
            selectedImageView.setImageDrawable(image3.drawable)
        }

        image4.setOnClickListener {
            selectedImageView.setImageDrawable(image4.drawable)
        }

        image5.setOnClickListener {
            selectedImageView.setImageDrawable(image5.drawable)
        }

        image6.setOnClickListener {
            selectedImageView.setImageDrawable(image6.drawable)
        }
    }
}