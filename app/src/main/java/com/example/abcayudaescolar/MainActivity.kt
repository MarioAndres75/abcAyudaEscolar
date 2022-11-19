package com.example.abcayudaescolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

var posicion =0
class MainActivity : AppCompatActivity() {

    lateinit var dniLog :EditText
    lateinit var claveLog : EditText
    lateinit var aceptar:Button
    lateinit var error: Button
    lateinit var registro:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dniLog=findViewById(R.id.dniLog)
        claveLog=findViewById(R.id.claveLog)
        aceptar=findViewById(R.id.ingresar)
        error=findViewById(R.id.cambiaClave)
        registro=findViewById(R.id.aceptarRegistro)

        aceptar.setOnClickListener {
            var aceptado=false
            var alumno =""
            for ( i in 1..Repositorio.get().size) {
                if (Repositorio.get()[i-1].dni == dniLog.text.toString() &&
                    Repositorio.get()[i-1].clave == claveLog.text.toString()
                ) {
                    alumno = Repositorio.get()[i-1].nombre
                    posicion=i-1
                    aceptado = true

                }
            }
            dniLog.text.clear()
            claveLog.text.clear()
            if(aceptado) {

                val lanzar = Intent(this,pantallaPrincipal::class.java)
                startActivity(lanzar)
            }else{

                val lanzar = Intent(this,MainActivity::class.java) //home
                startActivity(lanzar)
            }
        }
        error.setOnClickListener {
            val lanzar2 = Intent(this,pantallaAunNoHabilitada::class.java)
            startActivity(lanzar2)
        }

        registro.setOnClickListener {
            val lanzar2 = Intent(this,formularioRegistro::class.java)
            startActivity(lanzar2)
        }
    }

    fun getPosicion(): Int {
        return posicion
    }
}