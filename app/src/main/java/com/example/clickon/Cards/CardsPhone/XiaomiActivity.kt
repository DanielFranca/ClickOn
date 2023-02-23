package com.example.clickon.Cards.CardsPhone

import PhoneItem
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clickon.R
import com.example.clickon.databinding.XiaomiActivityBinding

class XiaomiActivity: AppCompatActivity(){
    private lateinit var binding: XiaomiActivityBinding
    private lateinit var textPhone: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = XiaomiActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // busca o TextView pelo ID e atribui à variável textPhone
        textPhone = findViewById(R.id.text_phone)

        // configura o DrawableLeft como um ícone de voltar
        val drawable = ContextCompat.getDrawable(this, R.drawable.ic_back)
        textPhone.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null)

        // configura o OnClickListener para fechar a Activity ao clicar no ícone de voltar
        textPhone.setOnClickListener { finish() }

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        val adapter = PhoneListAdapter(getList())
        binding.recyclerView.adapter = adapter
    }

    private fun getList() = listOf(
        PhoneItem(64, "MI 10 Lite ", "Xiaomi", R.drawable.mi10_lite),
        PhoneItem(65, "MI 10 Lite Zoom", "Xiaomi", R.drawable.mi10lite_zoom),
        PhoneItem(66, "Black Shark", "Xiaomi", R.drawable.blackshark3),
        PhoneItem(67, "MI 10 Ultra", "Xiaomi", R.drawable.mi10_ultra),
        PhoneItem(68, "MI 10S", "Xiaomi", R.drawable.mi10s),
        PhoneItem(69, "Black Shark 4 PRO ", "Xiaomi", R.drawable.blackshark4pro),
        PhoneItem(70, "MI 11 Ultra ", "Xiaomi", R.drawable.mi11ultra),
        PhoneItem(71, "MI Mix Fold ", "Xiaomi", R.drawable.mimixfold),
        PhoneItem(72, "MI 11X Pro", "Xiaomi", R.drawable.mi11xpro),
        PhoneItem(73, "MI 11X", "Xiaomi", R.drawable.mi11x),
        PhoneItem(74, "MI Mix 4", "Xiaomi", R.drawable.mimix4),
        PhoneItem(75, "Civi", "Xiaomi", R.drawable.civi1s),
        PhoneItem(76, "Black Shark 4S PRO", "Xiaomi", R.drawable.blackshark4pro),
        PhoneItem(77, "11i", "Xiaomi", R.drawable.mi11i),
        PhoneItem(78, "11i HyperCharge", "Xiaomi", R.drawable.hypercharge11i),
        PhoneItem(79, "12 PRO", "Xiaomi", R.drawable.mi12pro),
        PhoneItem(80, "Black Shark 5", "Xiaomi", R.drawable.blackshark5),
        PhoneItem(81, "Black Shark 5 RS", "Xiaomi", R.drawable.blackshark5rs),
        PhoneItem(82, "Civi 1S", "Xiaomi", R.drawable.civi1s),
        PhoneItem(83, "12S Ultra", "Xiaomi", R.drawable.mi12sultra),
        PhoneItem(84, "12S", "Xiaomi", R.drawable.mi12s),
        PhoneItem(85, " 12S PRO", "Xiaomi", R.drawable.mi12spro),
        PhoneItem(86, " 12S PRO (MediaTek)", "Xiaomi", R.drawable.s12mediatek),
        PhoneItem(87, " Mix Fold 2", "Xiaomi", R.drawable.mixfold2),
        PhoneItem(88, " Civi 2", "Xiaomi", R.drawable.civi2),
        PhoneItem(89, " 13 PRO", "Xiaomi", R.drawable.mi13pro),
        PhoneItem(90, " 13", "Xiaomi", R.drawable.mi13),
        PhoneItem(91, " MI 9 Lite", "Xiaomi", R.drawable.mi10s),
        PhoneItem(92, " MI Note 10 PRO", "Xiaomi", R.drawable.minote10pro),
        PhoneItem(93, " MI 11", "Xiaomi", R.drawable.mi11),
        PhoneItem(94, " Black Shark 3", "Xiaomi", R.drawable.blackshark3),
        PhoneItem(95, " MI 10T PRO", "Xiaomi", R.drawable.mi10tpro),
        PhoneItem(96, " MI Note 10 Lite", "Xiaomi", R.drawable.minote10lite),
        PhoneItem(97, " Black Shark 4", "Xiaomi", R.drawable.blackshark4),
        PhoneItem(98, " MI 10T Lite", "Xiaomi", R.drawable.mi10tlite),
        PhoneItem(99, " 11T", "Xiaomi", R.drawable.mi11t),
        PhoneItem(99, " Mi 11i", "Xiaomi", R.drawable.mi11i),
        PhoneItem(100, " MI 10T", "Xiaomi", R.drawable.mi10t),
        PhoneItem(101, " 12", "Xiaomi", R.drawable.mi12),
        PhoneItem(102, " 12T", "Xiaomi", R.drawable.mi12t),
        PhoneItem(103, " Black Shark 5 PRO", "Xiaomi", R.drawable.blackshark5pro),
        PhoneItem(104, " 12X ", "Xiaomi", R.drawable.mi12x),
        PhoneItem(103, " MI 11 Lite ", "Xiaomi", R.drawable.mi11lite),
        PhoneItem(104, " MI 11 Lite 5G", "Xiaomi", R.drawable.mi11lite5g),
        PhoneItem(105, " 11 Lite NE", "Xiaomi", R.drawable.mi11lite),
        PhoneItem(106, " 12 Lite ", "Xiaomi", R.drawable.mi12lite),
        PhoneItem(107, " 11T PRO", "Xiaomi", R.drawable.mi11tpro),
        PhoneItem(108, " 12T PRO", "Xiaomi", R.drawable.mi12tpro),
        PhoneItem(109, " MI 11 PRO", "Xiaomi", R.drawable.mi11tpro)
    )

    private inner class PhoneListAdapter(private val phoneList: List<PhoneItem>) :
        RecyclerView.Adapter<PhoneListViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneListViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.phone_item, parent, false)
            return PhoneListViewHolder(view)
        }

        override fun onBindViewHolder(holder: PhoneListViewHolder, position: Int) {
            holder.bind(phoneList[position])
        }

        override fun getItemCount() = phoneList.size
    }

    private inner class PhoneListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val phoneImageView: ImageView = view.findViewById(R.id.image_phone)
        private val phoneNameTextView: TextView = view.findViewById(R.id.text_phone)


        fun bind(phoneItem: PhoneItem) {
            phoneImageView.setImageResource(phoneItem.getFlagImage())
            phoneNameTextView.text = phoneItem.phoneName

        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
