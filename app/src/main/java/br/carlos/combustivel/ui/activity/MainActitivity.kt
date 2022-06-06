package br.carlos.combustivel.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.carlos.combustivel.R
import br.carlos.combustivel.model.Informacoes
import br.carlos.combustivel.ui.recyclerview.adapter.ListaAbastecimentoAdapter
import java.math.BigDecimal

class MainActitivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaAbastecimentoAdapter(context = this, informacoes = listOf(
            Informacoes(data = "6/6/2022",
                total = BigDecimal(99),
                valor_litro = BigDecimal(5),
                quantidade = BigDecimal(18),
                tipo = "Etanol aditivado",
                local = "Shopping Ibirapuera"
            ),
        ))
//        val data = findViewById<TextView>(R.id.data)
//        data.text = "28/03/2022"
//
//        val total = findViewById<TextView>(R.id.total)
//        total.text = "50.00 Reais"
//
//        val valor_litro = findViewById<TextView>(R.id.valor_litro)
//        valor_litro.text = "3.13 por litro"
//
//        val quantidade = findViewById<TextView>(R.id.quantidade)
//        quantidade.text = "21 L"
//
//        val tipo = findViewById<TextView>(R.id.tipo)
//        tipo.text = "Etanol Aditivado"
//
//        val local = findViewById<TextView>(R.id.local)
//        local.text = "Extra Campo Limpo"
    }
}