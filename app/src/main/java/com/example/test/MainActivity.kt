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
        val btnChangeText = findViewById(R.id.btn_change_text) as Button;
        val tvBMI = findViewById(R.id.output_BMI) as TextView;
        val weight = findViewById(R.id.input_weight) as EditText;
        val height = findViewById(R.id.input_height) as EditText;
        var bmiWeight = 0;
        var bmiHeight = 0;
        var bmiCalc = 0;

        btnChangeText.setOnClickListener {
            bmiWeight = (weight.text.toString().toInt());
            bmiHeight = (height.text.toString().toInt());
            bmiCalc = (bmiWeight / bmiHeight / bmiHeight) * 10000;
            tvBMI.text = bmiCalc.toString();
        }

    }

}
