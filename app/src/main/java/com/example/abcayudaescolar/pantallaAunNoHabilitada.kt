package com.example.abcayudaescolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pantallaAunNoHabilitada : AppCompatActivity() {
    lateinit var boton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_aun_no_habilitada)
        boton= findViewById(R.id.button)
        boton.setOnClickListener {
            val lanzar = Intent(this,pantallaPrincipal::class.java) //home
            startActivity(lanzar)
        }
    }
}