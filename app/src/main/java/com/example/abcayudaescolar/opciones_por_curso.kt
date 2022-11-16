package com.example.abcayudaescolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class opciones_por_curso : AppCompatActivity() {
    lateinit var materiaOpciones:TextView
    lateinit var accesoClasesOnLine:Button
    lateinit var volverAlInicio:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones_por_curso)
        materiaOpciones=findViewById(R.id.nombreMateriaOpciones)
        accesoClasesOnLine=findViewById(R.id.clasesOnLine)
        volverAlInicio=findViewById(R.id.alInicioDesdeOpciones)

        materiaOpciones.text= materia
        accesoClasesOnLine.setOnClickListener {
            if (materia == "Matematicas") {

                val lanzar = Intent(this, clases_on_line::class.java) //home
                startActivity(lanzar)
                finish()

            } else {
                val lanzar = Intent(this, pantallaAunNoHabilitada::class.java) //home
                startActivity(lanzar)
            }
        }

        volverAlInicio.setOnClickListener {
            val lanzar = Intent(this, pantallaPrincipal::class.java) //home
            startActivity(lanzar)
            finish()
        }
    }
}