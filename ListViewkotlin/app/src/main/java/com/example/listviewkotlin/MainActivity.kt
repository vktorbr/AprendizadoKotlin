package com.example.listviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var jogos = ArrayList<Jogo>()
        jogos.add(Jogo("God of War", "PS4"))
        jogos.add(Jogo("Halo", "XONE"))
        //Toast.makeText(this, jogos[1].nome, Toast.LENGTH_SHORT).show()
        var adapter: ListaAdapter = ListaAdapter(applicationContext, jogos)
        lista.adapter = adapter

    }
}