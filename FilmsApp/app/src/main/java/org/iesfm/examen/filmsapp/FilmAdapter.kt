package org.iesfm.examen.filmsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FilmAdapter(val context: Context, val films: List<Film>) : Adapter<FilmAdapter.FilmViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)

    class FilmViewHolder(val v: View) : ViewHolder(v) {
        fun load(film: Film) {
            val titleTv = v.findViewById<TextView>(R.id.tv_title)
            titleTv.text = "Titulo ${film.title}"

            val yearTv = v.findViewById<TextView>(R.id.tv_year)
            yearTv.text = "Año: ${film.year}"

            val genreTv = v.findViewById<TextView>(R.id.tv_genre)
            genreTv.text = film.genre
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        return FilmViewHolder(layoutInflater.inflate(R.layout.rv_film_layout, null))
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.load(films[position])
    }

    override fun getItemCount(): Int {
        return films.size
    }
}