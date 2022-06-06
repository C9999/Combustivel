package br.carlos.combustivel.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.carlos.combustivel.R
import br.carlos.combustivel.model.Informacoes


class ListaAbastecimentoAdapter (
    private val context: Context,
    private val informacoes: List<Informacoes>
): RecyclerView.Adapter<ListaAbastecimentoAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun vincula(informacoes: Informacoes){
            val data = itemView.findViewById<TextView>(R.id.data)
            data.text = informacoes.data

            val total = itemView.findViewById<TextView>(R.id.total)
            total.text = informacoes.total.toPlainString()

            val valor_litro = itemView.findViewById<TextView>(R.id.valor_litro)
            valor_litro.text = informacoes.valor_litro.toString()

            val quantidade = itemView.findViewById<TextView>(R.id.quantidade)
            quantidade.text = informacoes.quantidade.toString()

            val tipo = itemView.findViewById<TextView>(R.id.tipo)
            tipo.text = informacoes.tipo

            val local = itemView.findViewById<TextView>(R.id.local)
            local.text = informacoes.local
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.abastecimento_infos, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val informacao = informacoes[position]
        holder.vincula(informacao)
    }

    override fun getItemCount(): Int = informacoes.size

}



