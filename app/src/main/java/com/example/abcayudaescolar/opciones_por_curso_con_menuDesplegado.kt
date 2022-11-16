package com.example.abcayudaescolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var  volverALMenu: Button
class opciones_por_curso_con_menuDesplegado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones_por_curso_con_menu_desplegado)
        volverALMenu= findViewById(R.id.volverAMenu)



        volverALMenu.setOnClickListener{
            val lanzar = Intent(this, pantallaPrincipal::class.java) //home
            startActivity(lanzar)
            finish()
        }




    }
}