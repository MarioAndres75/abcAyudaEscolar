package com.example.abcayudaescolar

class Alumnos(val dni: String, val nombre: String, val apellido: String,
              var institucion: String, var curso: String, var clave: String) {

    fun setClave(clave: String): Boolean {
        this.clave = clave
        return true
    }
}