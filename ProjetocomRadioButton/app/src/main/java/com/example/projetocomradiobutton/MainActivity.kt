package com.example.projetocomradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var group: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        group = findViewById(R.id.groupButton)

        button.setOnClickListener {
            if(group.checkedRadioButtonId != -1){
                radioSelecionado(group.checkedRadioButtonId)
            }else{
                Toast.makeText(applicationContext, "nada selecionado", Toast.LENGTH_SHORT).show()
            }
        }

        group.setOnCheckedChangeListener { radioGroup, i -> i
            radioSelecionado(i)
        }

    }

    private fun radioSelecionado(i: Int) {
        var radioSelecionado: RadioButton = findViewById(i)
        Toast.makeText(
            applicationContext,
            "${radioSelecionado.text} selecionada!",
            Toast.LENGTH_SHORT
        ).show()
    }
}