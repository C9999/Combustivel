package br.carlos.combustivel.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import br.carlos.combustivel.R

class MainActitivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = findViewById<TextView>(R.id.data)
        data.text = "28/03/2022"

        val total = findViewById<TextView>(R.id.total)
        total.text = "50.00 Reais"

        val valor_litro = findViewById<TextView>(R.id.valor_litro)
        valor_litro.text = "3.13 por litro"

        val quantidade = findViewById<TextView>(R.id.quantidade)
        quantidade.text = "21 L"

        val tipo = findViewById<TextView>(R.id.tipo)
        tipo.text = "Etanol Aditivado"

        val local = findViewById<TextView>(R.id.local)
        local.text = "Extra Campo Limpo"

    }
}