package com.example.entreganavegacion

import android.media.Image
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        Log.d(SecondActivity::class.simpleName,"onCreate")

        val imagen1 = findViewById<ImageView>(R.id.imagen1)


    }


}