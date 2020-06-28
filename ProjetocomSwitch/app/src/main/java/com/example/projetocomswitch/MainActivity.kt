package com.example.projetocomswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var botao: Button
    lateinit var interruptor: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.statusSwitch)
        botao = findViewById(R.id.button)
        interruptor = findViewById(R.id.switch1)

        interruptor.setOnCheckedChangeListener { compoundButton, b -> b
            texto.text = when(b){
                true -> "ligado"
                false -> "desligado"
            }
        }

        botao.setOnClickListener {
            var status = when(interruptor.isChecked){
                true -> "ligado"
                false -> "desligado"
            }

            Toast.makeText(applicationContext, "O status é: $status", Toast.LENGTH_LONG).show()
        }

    }
}