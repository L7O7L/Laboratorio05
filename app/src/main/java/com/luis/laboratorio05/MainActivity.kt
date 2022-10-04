package com.luis.laboratorio05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Manera convencional de acceder a los componentes
        //val title = findViewById<TextView>(R.id.textView)
        //title.text = "Nuevo Texto Centrado"
        //Manera de acceder a los componentes con kotlin extensions
        textView.text = "Nuevo texto centrado"


        btn1.setOnClickListener {
            Toast.makeText(this, "Click Btn1", Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            Toast.makeText(this, "Click Btn2", Toast.LENGTH_SHORT).show()
        }

        textView.setOnClickListener {
            Toast.makeText(this, "Click txView", Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener {
            textView.visibility = View.GONE
        }


    }
}