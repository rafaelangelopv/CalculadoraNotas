package com.example.calculadoranotas

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalculate = btCalculate
        val resultado = resultado

        btCalculate.setOnClickListener {

            val nota1 = Integer.parseInt(Nota01.text.toString())
            val nota2 = Integer.parseInt(Nota02.text.toString())
            val faltas = Integer.parseInt(Faltas.text.toString())

            val media = (nota1+nota2)/2

            if(media >= 6 && faltas <= 10){
                resultado.text = "\nAluno Aprovado!\nNota Final: $media\nFaltas: $faltas"
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.text = "\nAluno Reprovado!\nNota Final: $media\nFaltas: $faltas"
                resultado.setTextColor(Color.RED)
            }
        }

    }
}