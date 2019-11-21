package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnChangeText=findViewById(R.id.btn_change_text)as Button;
        val tvBMI=findViewById(R.id.output_BMI) as TextView;
        var weight=findViewById(R.id.input_weight) as EditText;
        var height=findViewById(R.id.input_height) as EditText;
        var bmiCalc=(height.text.toString().toInt()+weight.text.toString().toInt());

        btnChangeText.setOnClickListener {
            tvBMI.text= bmiCalc.toString();
        }

    }

    }
