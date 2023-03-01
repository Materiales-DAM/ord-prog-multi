package org.iesfm.examen.filmsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FilmAdapter(val context: Context) : Adapter<FilmAdapter.FilmViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)

    class FilmViewHolder(val v: View) : ViewHolder(v) {
        fun load(film: Film) {
            TODO("Not yet implemented")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}