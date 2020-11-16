package com.example.entreganavegacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import java.lang.Math.random
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MainActivity::class.simpleName,"onCreate")


        val parametro="Hola que tal"
        val button1 = findViewById<TextView>(R.id.button1)
        button1.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("Variable1", parametro)
            //ejecutarlo:
            startActivity(intent)
        }


        val button2 = findViewById<TextView>(R.id.button2)
        val edittext11 = findViewById<EditText>(R.id.editText1)
        button2.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            var tamano = edittext11.text.length

            intent.putExtra("Variable Tamaño", tamano)
            //ejecutarlo:
            startActivity(intent)
        }

        val button3 = findViewById<TextView>(R.id.button3)
        button3.setOnClickListener{
            val rd = random(1,2)

            var tamano = edittext11.text.length

            intent.putExtra("Variable Tamaño", tamano)

            switch(number) {
                case 1:
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
                break

                case 2:
                val intent = Intent(this, ThirdActivity::class.java)
                var tamano = edittext11.text.length

                intent.putExtra("Variable Tamaño", tamano)
                startActivity(intent)
                break
            }

        }
    }


}