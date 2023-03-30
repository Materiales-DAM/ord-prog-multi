package org.iesfm.examen.filmsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

        val rv = findViewById<RecyclerView>(R.id.filmsReciclerView)
        rv.adapter = FilmAdapter(this, films)
        rv.layoutManager = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)

        val addFilmButton = findViewById<Button>(R.id.addFilmButton)
        addFilmButton.setOnClickListener { e ->
            val openAddFilmActivity = Intent(this, AddFilmActivity::class.java)
            startActivity(openAddFilmActivity)
        }
    }
}