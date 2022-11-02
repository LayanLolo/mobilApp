package com.example.assmobileapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

public class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flag = ""
        val button: Button = findViewById(R.id.IdButton)
        val priceText: TextView = findViewById(R.id.price)
        val spinnerVal: Spinner = findViewById(R.id.spinnerV)
        var opts = arrayOf("Spain", "Italy", "Canada", "Egypt", "Japan")
        spinnerVal.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opts)

        button.setOnClickListener { view ->
            if (flag == "Spain")
                priceText.text = "Spain ticket is 250JD"
            else if (flag == "Italy")
                priceText.text = "Italy ticket is 235JD"
            else if (flag == "Canada")
                priceText.text = "Canada ticket is 270JD"
            else if (flag == "Egypt")
                priceText.text = "Egypt ticket is 99JD"
            else if (flag == "Japan")
                priceText.text = "Japan ticket is 299JD"
        }
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = opts.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
    }
}