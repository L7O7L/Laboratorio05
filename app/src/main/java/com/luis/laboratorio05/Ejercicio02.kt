package com.luis.laboratorio05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ejercicio02.*

class Ejercicio02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio02)
        ShowResults()
    }

    fun ShowResults(){

        btn04.setOnClickListener {

            val name = InputNombre.text
            val apellido = InputApellido.text
            val correo = InputCorreo.text

            ViewNombre.text = name
            ViewApellido.text = apellido
            ViewCorreo.text = correo

            lnResult.visibility = View.VISIBLE

        }

    }

}