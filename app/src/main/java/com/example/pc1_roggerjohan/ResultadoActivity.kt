package com.example.pc1_roggerjohan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
    }

    val suma = intent.getDoubleExtra("suma", 0.0)

    textViewResultado.text = "Resultado: $suma"

    if (suma >= 10.5) {
        textViewResultado.append("\nAprobado")
    } else {
        textViewResultado.append("\nDesaprobado")
    }


}