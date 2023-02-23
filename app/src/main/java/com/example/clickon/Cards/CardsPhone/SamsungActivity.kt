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
import com.example.clickon.databinding.SamsungActivityBinding

class SamsungActivity : AppCompatActivity(){
        private lateinit var binding: SamsungActivityBinding
        private lateinit var textPhone: TextView


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = SamsungActivityBinding.inflate(layoutInflater)
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
            PhoneItem(185, " Galaxy A3 ", "Samsung", R.drawable.galaxy_a3),
            PhoneItem(186, " Galaxy A5 ", "Samsung", R.drawable.galaxy_a5),
            PhoneItem(187, " Galaxy A7 ", "Samsung", R.drawable.galaxy_a7),
            PhoneItem(188, " Galaxy A8 ", "Samsung", R.drawable.galaxy_a8),
            PhoneItem(189, " Galaxy A8+ ", "Samsung", R.drawable.galaxy_a8mais),
            PhoneItem(200, " Galaxy C5 Pro", "Samsung", R.drawable.galaxy_c5pro),
            PhoneItem(201, " Galaxy C7", "Samsung", R.drawable.galaxy_c7),
            PhoneItem(202, " Galaxy J2", "Samsung", R.drawable.galaxy_j2),
            PhoneItem(203, " Galaxy J3", "Samsung", R.drawable.galaxy_j3),
            PhoneItem(204, " Galaxy J3 Emerge ", "Samsung", R.drawable.galaxy_j3emerge),
            PhoneItem(205, " Galaxy J5 ", "Samsung", R.drawable.galaxy_j5),
            PhoneItem(206, " Galaxy J7", "Samsung", R.drawable.galaxy_j7),
            PhoneItem(207, " Galaxy J7 Max", "Samsung", R.drawable.galaxy_j7max),
            PhoneItem(208, " Galaxy J7 Nxt", "Samsung", R.drawable.galaxy_j7nxt),
            PhoneItem(209, " Galaxy J7 V", "Samsung", R.drawable.galaxy_j7v),
            PhoneItem(210, " Galaxy Note 8", "Samsung", R.drawable.galaxy_note8),
            PhoneItem(211, " Galaxy Note FE", "Samsung", R.drawable.galaxy_notefe),
            PhoneItem(212, " Galaxy S8", "Samsung", R.drawable.galaxy_s8),
            PhoneItem(213, " Galaxy S8 Active", "Samsung", R.drawable.galaxy_s8_active),
            PhoneItem(214, " Galaxy S8+ ", "Samsung", R.drawable.galaxy_s8mais),
            PhoneItem(215, " Galaxy A6 ", "Samsung", R.drawable.galaxy_a6),
            PhoneItem(216, " Galaxy A6+ ", "Samsung", R.drawable.galaxy_a6mais),
            PhoneItem(217, " Galaxy A6s ", "Samsung", R.drawable.galaxy_a6s),
            PhoneItem(218, " Galaxy A7 ", "Samsung", R.drawable.galaxy_a7),
            PhoneItem(219, " Galaxy A8 Star", "Samsung", R.drawable.galaxy_a8),
            PhoneItem(220, " Galaxy A8s ", "Samsung", R.drawable.galaxy_a8s),
            PhoneItem(221, " Galaxy A9 ", "Samsung", R.drawable.galaxy_a9),
            PhoneItem(222, " Galaxy A9 Star ", "Samsung", R.drawable.galaxy_a9star),
            PhoneItem(223, " Galaxy Gran Prime Pro", "Samsung", R.drawable.galaxy_granprimeplus),
            PhoneItem(224, " Galaxy J2 Core ", "Samsung", R.drawable.galaxy_j2),
            PhoneItem(225, " Galaxy J2 Pro", "Samsung", R.drawable.galaxy_j2),
            PhoneItem(226, " Galaxy J3 ", "Samsung", R.drawable.galaxy_j3),
            PhoneItem(227, " Galaxy J4 ", "Samsung", R.drawable.galaxy_j4),
            PhoneItem(229, " Galaxy J4+ ", "Samsung", R.drawable.galaxy_j4mais),
            PhoneItem(230, " Galaxy J6 ", "Samsung", R.drawable.galaxy_j6),
            PhoneItem(231, " Galaxy J6+ ", "Samsung", R.drawable.galaxy_j6mais),
            PhoneItem(234, " Galaxy J7 Pro ", "Samsung", R.drawable.galaxy_j7pro),
            PhoneItem(235, " Galaxy J8 ", "Samsung", R.drawable.galaxy_j8),
            PhoneItem(236, " Galaxy Note 9", "Samsung", R.drawable.galaxy_note9),
            PhoneItem(237, " Galaxy Light Luxury", "Samsung", R.drawable.galaxy_lightluxury),
            PhoneItem(238, " Galaxy S9 ", "Samsung", R.drawable.galaxy_s9),
            PhoneItem(239, " Galaxy S9+ ", "Samsung", R.drawable.galaxy_s9mais),
            PhoneItem(240, " Galaxy A01 ", "Samsung", R.drawable.galaxy_a01),
            PhoneItem(241, " Galaxy A10 ", "Samsung", R.drawable.galaxy_a10),
            PhoneItem(242, " Galaxy A10e ", "Samsung", R.drawable.galaxy_a10e),
            PhoneItem(243, " Galaxy A10s ", "Samsung", R.drawable.galaxy_a10s),
            PhoneItem(244, " Galaxy A2 core ", "Samsung", R.drawable.galaxy_a2),
            PhoneItem(245, " Galaxy A20 ", "Samsung", R.drawable.galaxy_a20),
            PhoneItem(246, " Galaxy A20e ", "Samsung", R.drawable.galaxy_a20e),
            PhoneItem(247, " Galaxy A20s ", "Samsung", R.drawable.galaxy_a20s),
            PhoneItem(248, " Galaxy A30 ", "Samsung", R.drawable.galaxy_a30),
            PhoneItem(249, " Galaxy A30s ", "Samsung", R.drawable.galaxy_a30s),
            PhoneItem(250, " Galaxy A40 ", "Samsung", R.drawable.galaxy_a40),
            PhoneItem(251, "  Galaxy A50 ", "Samsung", R.drawable.galaxy_a50),
            PhoneItem(252, " Galaxy A50s ", "Samsung", R.drawable.galaxu_a50s),
            PhoneItem(253, " Galaxy A51", "Samsung", R.drawable.galaxy_a51),
            PhoneItem(254, " Galaxy A60", "Samsung", R.drawable.galaxy_a60),
            PhoneItem(255, " Galaxy A70 ", "Samsung", R.drawable.galaxy_a70),
            PhoneItem(256, " Galaxy A70s ", "Samsung", R.drawable.galaxy_a70s),
            PhoneItem(257, " Galaxy A71 ", "Samsung", R.drawable.galaxy_a71),
            PhoneItem(258, " Galaxy A80 ", "Samsung", R.drawable.galaxy_a80),
            PhoneItem(259, " Galaxy A90 5G  ", "Samsung", R.drawable.galaxy_a90),
            PhoneItem(260, " Galaxy Fold  ", "Samsung", R.drawable.galaxy_fold),
            PhoneItem(261, "  Galaxy Fold 5G  ", "Samsung", R.drawable.galaxy_fold),
            PhoneItem(262, " Galaxy M10  ", "Samsung", R.drawable.galaxy_m10),
            PhoneItem(263, " Galaxy M10s ", "Samsung", R.drawable.galaxy_m10s),
            PhoneItem(249, " Galaxy M20 ", "Samsung", R.drawable.galaxy_m20),
            PhoneItem(250, " Galaxy M30 ", "Samsung", R.drawable.galaxy_m30),
            PhoneItem(251, "  Galaxy M30s ", "Samsung", R.drawable.galaxy_m30s),
            PhoneItem(252, " Galaxy M40 ", "Samsung", R.drawable.moto_e40),
            PhoneItem(253, " Galaxy Note 10", "Samsung", R.drawable.galaxy_note10),
            PhoneItem(255, " Galaxy Note 10+ ", "Samsung", R.drawable.galaxy_note10mais),
            PhoneItem(257, " Galaxy S10 ", "Samsung", R.drawable.galaxy_s10),
            PhoneItem(259, " Galaxy S10+  ", "Samsung", R.drawable.galaxy_s10mais),
            PhoneItem(260, " Galaxy S10e  ", "Samsung", R.drawable.galaxy_s10e),
            PhoneItem(261, "  Galaxy A11  ", "Samsung", R.drawable.galaxy_a11),
            PhoneItem(262, " Galaxy A12  ", "Samsung", R.drawable.galaxy_a12),
            PhoneItem(263, " Galaxy A21 ", "Samsung", R.drawable.galaxy_a21),
            PhoneItem(264, " Galaxy A31s ", "Samsung", R.drawable.galaxy_a31s),
            PhoneItem(265, " Galaxy A41 ", "Samsung", R.drawable.galaxy_a41),
            PhoneItem(266, " Galaxy A42 5G  ", "Samsung", R.drawable.galaxy_a42),
            PhoneItem(267, " Galaxy A51 5G ", "Samsung", R.drawable.galaxy_a51),
            PhoneItem(269, " Galaxy F41  ", "Samsung", R.drawable.galaxy_f41),
            PhoneItem(270, " Galaxy M01 ", "Samsung", R.drawable.galaxy_m01),
            PhoneItem(271, " Galaxy M01s ", "Samsung", R.drawable.galaxy_m01s),
            PhoneItem(272, " Galaxy M11 ", "Samsung", R.drawable.galaxy_m11),
            PhoneItem(273, "  Galaxy M21 ", "Samsung", R.drawable.galaxy_m21),
            PhoneItem(274, " Galaxy M21s ", "Samsung", R.drawable.galaxy_m21s),
            PhoneItem(275, " Galaxy M31", "Samsung", R.drawable.galaxy_m31s),
            PhoneItem(276, " Galaxy M31s", "Samsung", R.drawable.galaxy_m31s),
            PhoneItem(278, " Galaxy M51 ", "Samsung", R.drawable.galaxy_m51),
            PhoneItem(279, " Galaxy Note 10 Lite ", "Samsung", R.drawable.galaxy_note10lite),
            PhoneItem(280, " Galaxy Note 20 ", "Samsung", R.drawable.galaxy_note20),
            PhoneItem(282, " Galaxy Note 20 Ultra ", "Samsung", R.drawable.galaxy_note20ultra),
            PhoneItem(284, "  Galaxy S10 Lite  ", "Samsung", R.drawable.galaxy_s10lite),
            PhoneItem(285, " Galaxy S20 5G  ", "Samsung", R.drawable.galaxy_s20),
            PhoneItem(286, " Galaxy S20 FE ", "Samsung", R.drawable.galaxy_s20fe),
            PhoneItem(288, " Galaxy S20 Ultra 5G  ", "Samsung", R.drawable.galaxy_s20_ultra),
            PhoneItem(289, "  Galaxy S20+ 5G ", "Samsung", R.drawable.galaxy_s20mais),
            PhoneItem(290, " Galaxy Z Flip  ", "Samsung", R.drawable.galaxy_zflip),
            PhoneItem(292, " Galaxy Z Fold2 5g", "Samsung", R.drawable.galaxy_zfold2),
            PhoneItem(302, " Galaxy A52 ", "Samsung", R.drawable.galaxy_a52),
            PhoneItem(304, "  Galaxy A52s 5G ", "Samsung", R.drawable.galaxy_a52s),
            PhoneItem(305, " Galaxy A72  ", "Samsung", R.drawable.galaxy_a72),
            PhoneItem(307, " Galaxy F02s", "Samsung", R.drawable.galaxy_f02s),
            PhoneItem(308, " Galaxy F12 ", "Samsung", R.drawable.galaxy_f12),
            PhoneItem(309, " Galaxy F22 ", "Samsung", R.drawable.galaxy_f22),
            PhoneItem(310, " Galaxy F42 5G ", "Samsung", R.drawable.galaxy_f42),
            PhoneItem(311, " Galaxy F52 5G ", "Samsung", R.drawable.galaxy_f52),
            PhoneItem(312, " Galaxy F62 ", "Samsung", R.drawable.galaxy_f62),
            PhoneItem(313, " Galaxy M02  ", "Samsung", R.drawable.galaxy_m02),
            PhoneItem(314, "  Galaxy MO2s  ", "Samsung", R.drawable.galaxy_m02),
            PhoneItem(315, " Galaxy M12  ", "Samsung", R.drawable.galaxy_m12),
            PhoneItem(317, " Galaxy M22 ", "Samsung", R.drawable.galaxy_m22),
            PhoneItem(318, " Galaxy M32  ", "Samsung", R.drawable.galaxy_m32),
            PhoneItem(320, " Galaxy A42 5G  ", "Samsung", R.drawable.galaxy_a42),
            PhoneItem(321, " Galaxy A52 5G", "Samsung", R.drawable.galaxy_a52),
            PhoneItem(322, " Galaxy M62", "Samsung", R.drawable.galaxy_m62),
            PhoneItem(323, " Galaxy Quantum 2 ", "Samsung", R.drawable.galaxy_quantum2),
            PhoneItem(324, " Galaxy S21 5G ", "Samsung", R.drawable.galaxy_s21),
            PhoneItem(325, " Galaxy S21 Ultra ", "Samsung", R.drawable.galaxy_s21ultra),
            PhoneItem(326, " Galaxy S21+ 5G ", "Samsung", R.drawable.galaxy_s21mais),
            PhoneItem(327, " Galaxy Z Flip3 5G ", "Samsung", R.drawable.galaxy_zflip3),
            PhoneItem(328, " Galaxy Z Fold3 5G  ", "Samsung", R.drawable.galaxy_zfold3),
            PhoneItem(329, "  Galaxy A03  ", "Samsung", R.drawable.galaxy_a03),
            PhoneItem(330, " Galaxy A04  ", "Samsung", R.drawable.galaxy_a04),
            PhoneItem(331, " Galaxy A04e ", "Samsung", R.drawable.galaxy_a04e),
            PhoneItem(332, " Galaxy A04s ", "Samsung", R.drawable.galaxy_a04s),
            PhoneItem(333, " Galaxy A13  ", "Samsung", R.drawable.galaxy_a13),
            PhoneItem(334, "  Galaxy A23 ", "Samsung", R.drawable.galaxy_a23),
            PhoneItem(336, " Galaxy A33 5G", "Samsung", R.drawable.galaxy_a33),
            PhoneItem(337, " Galaxy A53 5G", "Samsung", R.drawable.galaxy_a53),
            PhoneItem(338, " Galaxy A73 5G ", "Samsung", R.drawable.galaxy_a73),
            PhoneItem(339, " Galaxy F13 ", "Samsung", R.drawable.galaxy_f13),
            PhoneItem(340, " Galaxy F23 ", "Samsung", R.drawable.galaxy_f23),
            PhoneItem(341, " Galaxy M04 ", "Samsung", R.drawable.galaxy_m04),
            PhoneItem(342, " Galaxy M13 ", "Samsung", R.drawable.galaxy_m13),
            PhoneItem(343, " Galaxy M23  ", "Samsung", R.drawable.galaxy_m23),
            PhoneItem(344, "  Galaxy M33  ", "Samsung", R.drawable.galaxy_m33),
            PhoneItem(345, " Galaxy A14 ", "Samsung", R.drawable.galaxy_a14),
            PhoneItem(346, " Galaxy S23  ", "Samsung", R.drawable.galaxy_s23),
            PhoneItem(347, "  Galaxy S23 Ultra", "Samsung", R.drawable.galaxy_s23ultra),
            PhoneItem(347, "  Galaxy S23+  ", "Samsung", R.drawable.galaxy_s23mais)
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




