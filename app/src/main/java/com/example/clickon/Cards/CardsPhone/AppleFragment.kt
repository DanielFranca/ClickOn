package com.example.clickon.Cards.CardsPhone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clickon.R
import com.example.clickon.cardAdapter

class AppleFragment(private val phoneSuggestions: List<String>) : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: cardAdapter
    private var myList: MutableList<String> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_apple, container, false)
        recyclerView = view.findViewById(R.id.rv_card_aplle_item) // Obtém a referência para o RecyclerView
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Adiciona itens na lista
        myList.addAll(phoneSuggestions)

        // Inicializa o adapter e define o layout manager
        adapter = cardAdapter(myList)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
    }
}




