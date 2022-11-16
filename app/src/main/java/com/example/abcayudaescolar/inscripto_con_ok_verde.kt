package com.example.abcayudaescolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var volver : Button
class inscripto_con_ok_verde : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscripto_con_ok_verde)
        volver = findViewById(R.id.volverDeNuevo)


        volver.setOnClickListener{
            val lanzar = Intent(this,opciones_por_curso::class.java) //home
            startActivity(lanzar)
            finish()

        }
    }
}