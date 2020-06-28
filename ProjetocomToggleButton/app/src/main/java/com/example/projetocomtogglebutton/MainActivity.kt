package com.example.projetocomtogglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var botao: Button
    lateinit var texto: TextView
    lateinit var toggleButton: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao = findViewById(R.id.button)
        texto = findViewById(R.id.textView)
        toggleButton = findViewById(R.id.toggleButton)

        toggleButton.setOnCheckedChangeListener { compoundButton, b ->
            texto.text = retornaTexto(b)
        }

        botao.setOnClickListener {
            Toast.makeText(applicationContext, retornaTexto(toggleButton.isChecked), Toast.LENGTH_SHORT).show()
        }

    }

    private fun retornaTexto(b: Boolean) = when (b) {
            true -> "ligado"
            else -> "desligado"
    }
}