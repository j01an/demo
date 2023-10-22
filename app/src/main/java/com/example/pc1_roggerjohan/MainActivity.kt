package com.example.pc1_roggerjohan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener {
            val strNota1 = editTextNota1.text.toString()
            val strNota2 = editTextNota2.text.toString()
            val strNota3 = editTextNota3.text.toString()


            if (strNota1.isNotEmpty() && strNota2.isNotEmpty() && strNota3.isNotEmpty()) {

                val nota1 = strNota1.toDouble()
                val nota2 = strNota2.toDouble()
                val nota3 = strNota3.toDouble()


                val suma = (nota1 * 0.2) + (nota2 * 0.2) + (nota3 * 0.6)

                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("suma", suma)


                startActivity(intent)
            } else {

                Toast.makeText(this, "Por favor, ingrese todas las notas.", Toast.LENGTH_SHORT).show()
            }
        }


        }

}