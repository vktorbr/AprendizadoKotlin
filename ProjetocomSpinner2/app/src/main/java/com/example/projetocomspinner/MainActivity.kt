package com.example.projetocomspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var botao: Button
    lateinit var menu: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView2)
        botao = findViewById(R.id.button2)
        menu = findViewById(R.id.spinner2)

        var estados = arrayOf("Acre", "Maranhão", "Ceará", "Pernambuco")
        menu.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, estados)
        menu.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                texto.text = estados[p2]
            }
        }

        botao.setOnClickListener {
            Toast.makeText(applicationContext, estados[menu.selectedItemPosition], Toast.LENGTH_SHORT).show()
        }

    }
}