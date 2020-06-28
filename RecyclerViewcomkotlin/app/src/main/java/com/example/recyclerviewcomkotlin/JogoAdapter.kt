package com.example.recyclerviewcomkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class JogoAdapter(val context: Context, val itens: ArrayList<Jogo>) : RecyclerView.Adapter<JogoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        //inflar o layout
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.linha_jogo, parent, false)
        //instanciona o view atraves da classe ViewHolder
        val holder = JogoViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return itens.size
    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        //colocar os valores nos itens instanciados
        val jogo = itens.get(position)
        holder.nome.text = jogo.nome
        holder.plataforma.text = jogo.plataforma
        holder.nome.setOnClickListener {
            Toast.makeText(context, "Clicou em ${jogo.nome}", Toast.LENGTH_SHORT).show()
        }
    }
}