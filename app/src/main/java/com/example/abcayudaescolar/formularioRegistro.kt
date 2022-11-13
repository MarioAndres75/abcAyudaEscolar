package com.example.abcayudaescolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class formularioRegistro : AppCompatActivity() {
    lateinit var aceptar :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_registro)
        aceptar=findViewById(R.id.aceptarRegistro)
         aceptar.setOnClickListener {
             val lanzar = Intent(this,MainActivity::class.java)
             startActivity(lanzar)
         }
    }
}