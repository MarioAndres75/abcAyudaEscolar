package com.example.abcayudaescolar

object Repositorio {
    var alumnos: MutableList<Alumnos> = mutableListOf()

    init {
        alumnos.add(Alumnos("1", "MARIO", "OCAMPO", "ESCUELA 24","4","1"))
        alumnos.add(Alumnos("22222222", "ROBERTO", "PEREZ", "ESCUELA 22","6","1234"))
        alumnos.add(Alumnos("33333333", "GRACIELA", "GOMEZ", "ESCUELA 01","1","1234"))
        alumnos.add(Alumnos("44444444", "ALEJANDRA", "SALAS", "ESCUELA 14","2","1234"))
        alumnos.add(Alumnos("55555555", "JAVIER", "PINTOS", "ESCUELA 05","7","1234"))
        alumnos.add(Alumnos("66666666", "ROCIO", "ACHABAL", "ESCUELA 27","3","1234"))

    }


    fun get(): MutableList<Alumnos> {
        return alumnos
    }
}