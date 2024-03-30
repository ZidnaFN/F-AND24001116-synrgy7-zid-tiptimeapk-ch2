package com.example.layoutkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.ceil
//
//class MainActivity : AppCompatActivity() {
//    @SuppressLint("UseSwitchCompatOrMaterialCode")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        //val inputCost = findViewById<EditText>(R.id.editTextNominal)
//        val calculate = findViewById<Button>(R.id.buttonCalculate)
//        val tip = findViewById<TextView>(R.id.textView2)
//        val round = findViewById<Switch>(R.id.switchButton)
//
//        fun prosesData(): String {
//            return "Pemrosesan Data"
//        }
//
//        val dataView = prosesData()
//
//        calculate.setOnClickListener{
//            round.setOnCheckedChangeListener { buttonView, isChecked ->
//                if (isChecked) {
//                    val tipFinal = ceil(tip)
//                    tip.inputType * tip.inputType
//                } else {
//                    tip.text = dataView
//                }
//            }
//        }
//    }
//
//    private fun ceil(tip: TextView?): Double {
//
//    }
//}