package org.iesfm.examen.filmsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddFilmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_film)

        val cancelButton = findViewById<Button>(R.id.cancelButton)
        cancelButton.setOnClickListener { e ->
            finish()
        }
    }
}