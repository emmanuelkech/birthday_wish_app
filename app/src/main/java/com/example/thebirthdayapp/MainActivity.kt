package com.example.thebirthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wishButton: Button = findViewById(R.id.clickMe)
        val cake: ImageView = findViewById(R.id.birthdayCake)
        val background: androidx.constraintlayout.widget.ConstraintLayout = findViewById(R.id.theParent)

        wishButton.setOnClickListener {
            cake.visibility = View.VISIBLE
            background.setBackgroundResource(R.color.purple_200)
        }
    }
}