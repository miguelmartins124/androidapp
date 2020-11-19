package com.ulp.a21803222


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var radioGroup: RadioGroup
    private lateinit var radioGroup2: RadioGroup
    private lateinit var selectedRadioButton: RadioButton
    private lateinit var selectedRadioButton2: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="Calculo do valor IUC"
        textView=findViewById(R.id.valor)
        button=findViewById(R.id.calcular)
        radioGroup=findViewById(R.id.celindrada_valor)
        radioGroup2=findViewById(R.id.emissoes_valor)
        button.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            val selectedRadioButtonId2: Int = radioGroup2.checkedRadioButtonId
            if (selectedRadioButtonId != -1 &&  selectedRadioButtonId2 != -1) {
                selectedRadioButton = findViewById(selectedRadioButtonId)
                selectedRadioButton2 = findViewById(selectedRadioButtonId2)

                var resposta1: Float= 0.0f
                var resposta2: Float= 0.0f

                when(selectedRadioButtonId){
                    R.id.op1 -> resposta1 = 33.10f
                    R.id.op3 -> resposta1 = 66.50f
                    R.id.op3 -> resposta1 = 133.10f
                    R.id.op4 -> resposta1 = 455.30f
                }
                when(selectedRadioButtonId2){
                    R.id.op5 -> resposta2 = 57.0f
                    R.id.op6 -> resposta2 = 86.0f
                    R.id.op7 -> resposta2 = 133.01f
                    R.id.op8 -> resposta2 = 455.30f

                }
                var resposta3: Float = resposta1 + resposta2

                textView.text = "$resposta3"
            } else {
                textView.text = "Não foi nada selecionado"
            }

        }
        }
    }
