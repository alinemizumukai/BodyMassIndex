package com.example.bodymassindex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var editMass : EditText
    private lateinit var editHeight : EditText
    private lateinit var button : Button
    private lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editMass = findViewById(R.id.editMass)
        editHeight = findViewById(R.id.editHeight)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button.setOnClickListener { calculate() }
    }

    fun calculate(){
        val massStr = editMass.text.toString()
        val heightStr = editHeight.text.toString()

        val bodyMass = BodyMass()

        if (massStr != "" && heightStr != ""){
            val result = bodyMass.calculate(massStr.toDouble(), heightStr.toDouble())
            textView.text = result
        }else{
            Toast.makeText(this, "Please type both your mass and height to calculate.", Toast.LENGTH_LONG).show()
        }

    }
}