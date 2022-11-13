package com.example.abcayudaescolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Materia : AppCompatActivity() {
    lateinit var nombreMateria:TextView
     lateinit var primero:Button
     lateinit var volverDeseMateria:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materia)
        nombreMateria=findViewById(R.id.nombreMateriaOpciones)
        primero=findViewById(R.id.clasesOnLine)
        volverDeseMateria=findViewById(R.id.alInicioDeseMateria)
        nombreMateria.text= materia

    primero.setOnClickListener {
        val lanzar = Intent(this,opciones_por_curso::class.java) //home
       startActivity(lanzar)
    }
    volverDeseMateria.setOnClickListener {
        val lanzar2 = Intent(this,pantallaPrincipal::class.java) //home
        startActivity(lanzar2)
    }
    }
}