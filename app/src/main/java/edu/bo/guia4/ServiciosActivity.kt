package edu.bo.guia4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_servicios.*
import kotlin.random.Random

class ServiciosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var correctos=0;
        var Incorrectos=0;
        var number=7;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicios)
        num.setText(number.toString())

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        btnimpar.setOnClickListener {
            if (number%2!=0){
                correctos=correctos+1
            }
            else{
                Incorrectos++
            }
            number= Random(System.nanoTime()).nextInt(20 - 0 + 1) + 0
            num.setText(number.toString())
            num_incorrectos.setText(Incorrectos.toString());
            num_correctos.setText(correctos.toString())
        }
        btnpar.setOnClickListener {
            if (number%2==0){
                correctos=correctos+1
            }
            else{
                Incorrectos++
            }
            num_incorrectos.setText(Incorrectos.toString());
            num_correctos.setText(correctos.toString())
            number= Random(System.nanoTime()).nextInt(20 - 0 + 1) + 0
            num.setText(number.toString())
        }


    }
}