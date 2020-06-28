package com.example.projetocomdatepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dateSetListener = object : DatePickerDialog.OnDateSetListener{
            override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
                cal.set(Calendar.YEAR, p1)
                cal.set(Calendar.MONTH, p2)
                cal.set(Calendar.DAY_OF_MONTH, p3)

                val formatador = SimpleDateFormat("dd/mm/yyyy", Locale.ITALY)
                data!!.text = formatador.format(cal.time)

            }

        }


        button.setOnClickListener {
            DatePickerDialog(this, dateSetListener, cal.get(Calendar.YEAR),
            cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
        }

    }
}