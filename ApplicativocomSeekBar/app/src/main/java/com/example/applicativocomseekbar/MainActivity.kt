package com.example.applicativocomseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var text: TextView
    lateinit var botao: Button
    lateinit var seekBar: SeekBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.textView)
        botao = findViewById(R.id.button)
        seekBar = findViewById(R.id.seekBar)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                text.text = seekBar.progress.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                Toast.makeText(applicationContext, "Começou!", Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                Toast.makeText(applicationContext, "Terminou!", Toast.LENGTH_SHORT).show()
            }
        })

        botao.setOnClickListener {
            Toast.makeText(applicationContext, "o valor atual é: ${seekBar.progress}", Toast.LENGTH_LONG).show()
        }

    }
}