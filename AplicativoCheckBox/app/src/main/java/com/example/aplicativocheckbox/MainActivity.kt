package com.example.aplicativocheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var text: TextView
    lateinit var button: Button
    lateinit var checkBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        checkBox = findViewById(R.id.checkBox)

        checkBox.setOnCheckedChangeListener { compoundButton, b -> b
            Toast.makeText(applicationContext, "O marcador está: ${criaTexto(b)}", Toast.LENGTH_SHORT).show()
            text.text = criaTexto(b)
        }

        button.setOnClickListener {
            Toast.makeText(applicationContext, "O marcador está: ${criaTexto(checkBox.isChecked)}", Toast.LENGTH_SHORT).show()
        }

    }

    private fun criaTexto(b: Boolean) = when (b) {
            true -> "Marcado"
            else -> "Desmarcado"
    }

}