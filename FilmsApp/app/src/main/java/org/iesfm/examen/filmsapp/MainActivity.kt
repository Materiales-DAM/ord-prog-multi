package org.iesfm.examen.filmsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val films = listOf(
            Film("As bestas", 2022, "Thriller"),
            Film("Un funeral de muerte", 2011, "Comedia"),
            Film("La matanza de Texas", 1986, "Terror"),
            Film("Alcarras", 2022, "Drama"),
            Film("Mar adentro", 2012, "Drama"),
            Film("El secreto de sus ojos", 2010, "Thriller")
        )
    }
}