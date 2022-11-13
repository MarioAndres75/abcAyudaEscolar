package com.example.abcayudaescolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class clases_on_line : AppCompatActivity() {
    lateinit var inicio:Button
    lateinit var inscripcion:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clases_on_line)
        inicio=findViewById(R.id.al_inicio)
        inscripcion=findViewById(R.id.inscripcion)
        inicio.setOnClickListener {
            val lanzar = Intent(this,pantallaPrincipal::class.java) //home
            startActivity(lanzar)
        }
        inscripcion.setOnClickListener {
            val lanzar = Intent(this,inscripto::class.java) //home
            startActivity(lanzar)
        }
    }
}