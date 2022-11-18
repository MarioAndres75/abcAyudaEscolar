package com.example.abcayudaescolar
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import kotlin.system.exitProcess

var materia=""

lateinit var mate:Button
lateinit var lengua :Button
lateinit var geografia:Button
lateinit var quimica:Button
lateinit var historia:Button
lateinit var fisica:Button
lateinit var salir:ImageButton
lateinit var bajarBarra:Button
lateinit var menu:Button
lateinit var menuimage:View
class pantallaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)
        mate=findViewById(R.id.mate)
        lengua=findViewById(R.id.lengua)
        geografia=findViewById(R.id.geografia)
        quimica=findViewById(R.id.quimica)
        historia=findViewById(R.id.historia)
        fisica=findViewById(R.id.fisica)
        salir=findViewById(R.id.button2)
        bajarBarra=findViewById(R.id.cambioahomeconmenu)
        menu= findViewById(R.id.menu)
        menuimage=findViewById(R.id.nnnnnn)
        menu.visibility =View.INVISIBLE
        salir.setOnClickListener{
            finishAffinity()
        }
        menu.setOnClickListener{
            menu.visibility =View.VISIBLE
        }
        bajarBarra.setOnClickListener{
            val lanzar = Intent(this, opciones_por_curso_con_menuDesplegado::class.java) //home
            startActivity(lanzar)
        }


        mate.setOnClickListener {
        llamadaAMateria("Matematicas")
        }
       lengua.setOnClickListener {
            llamadaAMateria("Lengua y Literatura")
        }
        geografia.setOnClickListener {
            llamadaAMateria("Geografia")
        }
        quimica.setOnClickListener {
            llamadaAMateria("Quimica")
        }
        historia.setOnClickListener {
            llamadaAMateria("Historia")
        }
        fisica.setOnClickListener {
            llamadaAMateria("Fisica")
        }


    }

    private fun llamadaAMateria(nombreMateria: String) {
  materia=nombreMateria
        val lanzar = Intent(this,Materia::class.java) //home
        startActivity(lanzar)
    }


}