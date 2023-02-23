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
import com.example.clickon.databinding.MotorolaActivityBinding

class MotorolaActivity : AppCompatActivity() {
    private lateinit var binding: MotorolaActivityBinding
    private lateinit var textPhone: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MotorolaActivityBinding.inflate(layoutInflater)
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
        PhoneItem(110, " Moto G53", "Motorola", R.drawable.moto_g53),
        PhoneItem(111, " Moto G73", "Motorola", R.drawable.moto_g73),
        PhoneItem(112, " Moto E13", "Motorola", R.drawable.moto_e13),
        PhoneItem(113, " Moto G23", "Motorola", R.drawable.moto_g23),
        PhoneItem(114, " Moto G13", "Motorola", R.drawable.moto_g13),
        PhoneItem(116, " Moto E22i ", "Motorola", R.drawable.moto_e22i),
        PhoneItem(117, " Moto G72 ", "Motorola", R.drawable.moto_g72),
        PhoneItem(118, " Moto E22", "Motorola", R.drawable.moto_e22),
        PhoneItem(119, " Moto Edge 30", "Motorola", R.drawable.moto_edge30),
        PhoneItem(120, " Moto Edge 30 Fusion", "Motorola", R.drawable.moto_edge30fusion),
        PhoneItem(121, " Moto Edge 30 Neo", "Motorola", R.drawable.moto_edge30neo),
        PhoneItem(122, " Moto Edge 30 Ultra", "Motorola", R.drawable.moto_edge30ultra),
        PhoneItem(123, " Moto E22s", "Motorola", R.drawable.moto_e22s),
        PhoneItem(124, " Moto X30 Pro", "Motorola", R.drawable.moto_x30pro),
        PhoneItem(125, " Moto S30 Pro", "Motorola", R.drawable.moto_s30pro),
        PhoneItem(126, " Moto G32", "Motorola", R.drawable.moto_g32),
        PhoneItem(127, " Moto G62", "Motorola", R.drawable.moto_g62),
        PhoneItem(128, " Moto G42", "Motorola", R.drawable.moto_g42),
        PhoneItem(129, " Moto G52j", "Motorola", R.drawable.moto_g52j),
        PhoneItem(130, " Moto G71s", "Motorola", R.drawable.moto_g71s),
        PhoneItem(131, " Moto G82", "Motorola", R.drawable.moto_g82),
        PhoneItem(132, " Moto E32", "Motorola", R.drawable.moto_e32),
        PhoneItem(133, " Moto G200 5G", "Motorola", R.drawable.moto_g200),
        PhoneItem(134, " Moto G41", "Motorola", R.drawable.moto_g41),
        PhoneItem(135, " Moto G31", "Motorola", R.drawable.moto_g31),
        PhoneItem(136, " Moto G51", "Motorola", R.drawable.moto_g51),
        PhoneItem(137, " Moto E40", "Motorola", R.drawable.moto_e40),
        PhoneItem(138, " Moto E30", "Motorola", R.drawable.moto_e30),
        PhoneItem(139, " Moto E20 ", "Motorola", R.drawable.moto_e20),
        PhoneItem(140, " Moto Edge S Lite", "Motorola", R.drawable.moto_edge_s_lite),
        PhoneItem(141, " Moto Edge S Pro", "Motorola", R.drawable.moto_edge_s_pro),
        PhoneItem(142, " Moto Edge 20", "Motorola", R.drawable.moto_edge_20),
        PhoneItem(143, " Moto Edge 20 Lite", "Motorola", R.drawable.moto_edge20_lite),
        PhoneItem(144, " Moto Edge 20 Pro", "Motorola", R.drawable.moto_edge20_pro),
        PhoneItem(145, " Moto One 5G", "Motorola", R.drawable.moto_one_5g),
        PhoneItem(146, " Moto G60", "Motorola", R.drawable.moto_g60),
        PhoneItem(147, " Moto E7i", "Motorola", R.drawable.moto_e7i),
        PhoneItem(148, " Moto G100", "Motorola", R.drawable.moto_g100),
        PhoneItem(149, " Moto G10 Power", "Motorola", R.drawable.moto_g10power),
        PhoneItem(150, " Moto Edge S", "Motorola", R.drawable.moto_edge_s),
        PhoneItem(152, " Moto G Power", "Motorola", R.drawable.moto_gpower),
        PhoneItem(153, " Moto G9 Power", "Motorola", R.drawable.moto_g9power),
        PhoneItem(155, " Moto G9 Plus", "Motorola", R.drawable.moto_g9plus),
        PhoneItem(156, " Moto G9 Play", "Motorola", R.drawable.moto_g9play),
        PhoneItem(157, " Moto G9", "Motorola", R.drawable.moto_g9play),
        PhoneItem(158, " Moto One Vision Plus", "Motorola", R.drawable.moto_onevisionplus),
        PhoneItem(159, " Moto G 5G Plus", "Motorola", R.drawable.moto_5g_plus),
        PhoneItem(160, " Moto One Fusion", "Motorola", R.drawable.moto_one_fusion),
        PhoneItem(161, " Moto G Fast", "Motorola", R.drawable.moto_g_fast),
        PhoneItem(162, " Moto Edge+ ", "Motorola", R.drawable.moto_edgemais),
        PhoneItem(163, " Moto G8 Power Lite", "Motorola", R.drawable.moto_g8_powerlite),
        PhoneItem(165, " Moto E6s", "Motorola", R.drawable.moto_e6s),
        PhoneItem(166, " Moto G8", "Motorola", R.drawable.moto_g8),
        PhoneItem(167, " Moto G8 Power", "Motorola", R.drawable.moto_g8power),
        PhoneItem(168, " Moto G8 Plus", "Motorola", R.drawable.moto_g8plus),
        PhoneItem(169, " Moto G8 Play", "Motorola", R.drawable.moto_g8play),
        PhoneItem(170, " Moto One Macro", "Motorola", R.drawable.moto_onemacro),
        PhoneItem(171, " Moto One Zoom", "Motorola", R.drawable.moto_onezoom),
        PhoneItem(172, " Moto One Action", "Motorola", R.drawable.moto_oneaction),
        PhoneItem(173, " Moto E5 Plus", "Motorola", R.drawable.moto_e5plus),
        PhoneItem(174, " Moto G7 Play", "Motorola", R.drawable.moto_g7play),
        PhoneItem(175, " Moto G7 Power", "Motorola", R.drawable.motog7_power),
        PhoneItem(177, " Moto One Power", "Motorola", R.drawable.moto_onepower),
        PhoneItem(178, " Moto Z3", "Motorola", R.drawable.moto_z3),
        PhoneItem(179, " Moto G6 Play", "Motorola", R.drawable.moto_g6play),
        PhoneItem(180, " Moto G6 Plus", "Motorola", R.drawable.moto_g6plus),
        PhoneItem(181, " Moto G5S", "Motorola", R.drawable.moto_g5s),
        PhoneItem(182, " Moto G5", "Motorola", R.drawable.moto_g5),
        PhoneItem(183, " Moto C ", "Motorola", R.drawable.moto_c),
        PhoneItem(184, " Moto C Plus", "Motorola", R.drawable.moto_cplus)
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