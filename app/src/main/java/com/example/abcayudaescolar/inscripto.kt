package com.example.abcayudaescolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class inscripto : AppCompatActivity() {
    lateinit var volver:Button
    lateinit var confirmo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscripto)
        volver=findViewById(R.id.volver)
        confirmo=findViewById(R.id.confirmo)
        volver.setOnClickListener {
            val lanzar = Intent(this,pantallaPrincipal::class.java) //home
            startActivity(lanzar)
        }
        confirmo.setOnClickListener {
            val lanzar = Intent(this,opciones_por_curso::class.java) //home
            startActivity(lanzar)
        }
    }
}