package com.example.projetocomratingrab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var botao: Button
    lateinit var ratingBar: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        texto = findViewById(R.id.textoSelecionado)
        botao = findViewById(R.id.button)
        ratingBar = findViewById(R.id.ratingBar)
        
        ratingBar.setOnRatingBarChangeListener { ratingBar, fl, b ->  fl
            texto.text = ""+ fl
        }

        botao.setOnClickListener {
            Toast.makeText(applicationContext, "O rating selecionado é: ${ratingBar.rating}", Toast.LENGTH_LONG).show()
        }
        
    }
}