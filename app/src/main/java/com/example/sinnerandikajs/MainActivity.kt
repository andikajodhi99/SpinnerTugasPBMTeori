package com.example.sinnerandikajs

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * Spinner By Andika Jodhi Saputra
     * Nim : 175410174
     *
     * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val makanan = arrayOf("Nasi Ayam","Nasi Goreng","Nasi Pecel")
        spinner.adapter = ArrayAdapter(applicationContext, android.R.layout.simple_spinner_dropdown_item, makanan)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

            @SuppressLint("SetTextI18n")
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                seleteditem.text = "Kamu Memilih "+spinner.selectedItem.toString()
            }

        }
    }
}
