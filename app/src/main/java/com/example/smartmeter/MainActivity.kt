package com.example.smartmeter

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.AdapterView
import android.widget.Toast
import android.R.string
import android.widget.ArrayAdapter
//import android.R
import android.view.View
import android.widget.Spinner
import com.example.smartmeter.R


class MainActivity : AppCompatActivity() {
var it:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val colors = arrayOf("Rajasthan", "Gujarat", "Delhi", "Punjab", "Uttar Pradesh", "Karnataka", "Assam", "Kerala")

        // Initializing an ArrayAdapter
        val adapter = ArrayAdapter(
            this, // Context
            android.R.layout.simple_spinner_item, // Layout
            colors // Array
        )

        // Set the drop down view resource
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)

        // Finally, data bind the spinner object with dapter
        spinner.adapter = adapter;

        // Set an on item selected listener for spinner object
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                // Display the selected item text on text view
                it = parent.getItemAtPosition(position).toString()


            }


            override fun onNothingSelected(parent: AdapterView<*>) {
                // Another interface callback
            }


        }


        val city = arrayOf("Jaipur", "Ajmer", "Alwar", "Udaipur", "Alwar", "Jodhpur", "Bikaner", "Tonk")

        // Initializing an ArrayAdapter
        val ada = ArrayAdapter(
            this, // Context
            android.R.layout.simple_spinner_item, // Layout
            city// Array
        )

        // Set the drop down view resource
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)

        // Finally, data bind the spinner object with dapter
        spinner2.adapter = ada;

        // Set an on item selected listener for spinner object
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                // Display the selected item text on text view
                it = parent.getItemAtPosition(position).toString()


            }


            override fun onNothingSelected(parent: AdapterView<*>) {
                // Another interface callback
            }


        }




        button.setOnClickListener {
            var intent = Intent(this, Dash::class.java)
            if (Kno.text!=null&&Kno.text.length==11)
            {
                    startActivity(intent)

                    finish()
            }

        }



        }

    }

