package com.example.entreganavegacion

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)
        Log.d(ThirdActivity::class.simpleName, "onCreate")

        val textView1=findViewById<TextView>(R.id.textView1)


        var tamano = intent.getIntExtra("Variable Tamaño",0)
        textView1.text = "El edit text de la activity anterior tenía una longitud de $tamano  caracteres"

    }


}