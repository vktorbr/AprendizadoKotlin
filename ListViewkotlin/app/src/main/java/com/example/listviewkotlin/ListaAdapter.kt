package com.example.listviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.itemlinha_layout.view.*

class ListaAdapter(val context: Context, val jogos: ArrayList<Jogo>): BaseAdapter(){
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view = inflater.inflate(R.layout.itemlinha_layout, null)
        val nome = view.findViewById<TextView>(R.id.nome)
        val plataforma = view.findViewById<TextView>(R.id.plataforma)
        nome.text = jogos.get(p0).nome
        plataforma.text = jogos.get(p0).plataforma
        return view
    }

    override fun getItem(p0: Int): Any {
        return jogos.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()

    }

    override fun getCount(): Int {
        return jogos.size
    }

}