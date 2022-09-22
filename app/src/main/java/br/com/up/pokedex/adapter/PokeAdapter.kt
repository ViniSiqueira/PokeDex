package br.com.up.pokedex.adapter

import android.view.View
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView

class PokeAdapter: RecyclerView.Adapter<PokeAdapter.PokeViewHolder> {

    inner class PokeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}