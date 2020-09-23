package edu.bo.guia4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val button="ninguno"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_servicios.setOnClickListener {
           // toast("White")
            //Toast.makeText(context, "Write your message here", Toast.LENGTH_LONG).show()
            Toast.makeText(this@MainActivity, "Opcion de servicios", Toast.LENGTH_LONG).show()
            btn_servicios.setBackgroundColor(Color.parseColor("#009688"))
            btnPortafolio.setBackgroundColor(Color.parseColor("#009688"))
            btnAcercaDe.setBackgroundColor(Color.parseColor("#009688"))
            btnContacto.setBackgroundColor(Color.parseColor("#009688"))
            btnRedesSociales.setBackgroundColor(Color.parseColor("#009688"))
            val intent = Intent(this@MainActivity, ServiciosActivity::class.java)
            startActivity(intent)
        }
        btnPortafolio.setOnClickListener {
            selectedbutton.setText(R.string.btn_portafolio)
        }
        btnAcercaDe.setOnClickListener{
            selectedbutton.setText(R.string.btn_acercade)

        }
        btnContacto.setOnClickListener {
            selectedbutton.setText(R.string.btn_contacto)
        }
        btnRedesSociales.setOnClickListener {
            Toast.makeText(this@MainActivity, "RedesSociales is not available yet", Toast.LENGTH_LONG).show()}
    }
    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG) =
            Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()

}