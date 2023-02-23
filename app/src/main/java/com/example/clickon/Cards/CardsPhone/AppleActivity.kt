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
import com.example.clickon.databinding.AppleActivityBinding

class AppleActivity : AppCompatActivity() {

    private lateinit var binding: AppleActivityBinding
    private lateinit var textPhone: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AppleActivityBinding.inflate(layoutInflater)
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
        PhoneItem(1, " Iphone 6s - 16gb", "Apple", R.drawable.iphone6_16gb),
        PhoneItem(2, " Iphone 6s Plus - 32gb", "Apple", R.drawable.iphone6_32gb),
        PhoneItem(3, " Iphone SE - 32gb", "Apple", R.drawable.iphone_se_32gb),
        PhoneItem(4, " Iphone SE - 64gb", "Apple", R.drawable.iphone_se_64gb),
        PhoneItem(5, " Iphone SE - 128gb", "Apple", R.drawable.iphone_se_2020_128gb),
        PhoneItem(6, " Iphone 7 - 32gb ", "Apple", R.drawable.iphone7_32gb),
        PhoneItem(7, " Iphone 7 - 64gb ", "Apple", R.drawable.iphone7_32gb),
        PhoneItem(8, " Iphone 7 Plus - 128gb ", "Apple", R.drawable.iphone_7plus_128gb),
        PhoneItem(9, " Iphone 8 - 64gb", "Apple", R.drawable.iphone8_64gb),
        PhoneItem(10, " Iphone 8 Plus - 256gb", "Apple", R.drawable.iphone8_256gb),
        PhoneItem(11, " Iphone X - 64gb", "Apple", R.drawable.iphonex_64gb),
        PhoneItem(12, " Iphone X - 256gb", "Apple", R.drawable.iphonex_256gb),
        PhoneItem(13, " Iphone XR - 128gb", "Apple", R.drawable.iphonexr_128gb),
        PhoneItem(14, " Iphone XR - 256gb", "Apple", R.drawable.iphonexr_256gb),
        PhoneItem(15, " Iphone XS - 128gb", "Apple", R.drawable.iphonexs_128gb),
        PhoneItem(16, " Iphone XS MAX - 512gb", "Apple", R.drawable.iphonexsmax_512gb),
        PhoneItem(17, " Iphone 11 - 128gb", "Apple", R.drawable.iphone11_128gb),
        PhoneItem(18, " Iphone 11 - 256gb", "Apple", R.drawable.iphone11_256gb),
        PhoneItem(19, " Iphone 11 PRO - 256gb", "Apple", R.drawable.iphone11_pro_256),
        PhoneItem(20, " Iphone 11 PRO MAX - 512gb", "Apple", R.drawable.iphone11_promax_512gb),
        PhoneItem(21, " Iphone SE (2020) - 64gb", "Apple", R.drawable.iphone_se_2020_64gb),
        PhoneItem(22, " Iphone SE (2020) - 128gb", "Apple", R.drawable.iphone_se_2020_128gb),
        PhoneItem(23, " Iphone SE (2020) - 256gb", "Apple", R.drawable.iphonese_256gb_2020),
        PhoneItem(24, " Iphone 12 - 64gb", "Apple", R.drawable.iphone12_64gb),
        PhoneItem(25, " Iphone 12 - 128gb", "Apple", R.drawable.iphone12_128gb),
        PhoneItem(26, " Iphone 12 - 256gb", "Apple", R.drawable.iphone_12_256gb),
        PhoneItem(27, " Iphone 12 Mini - 64gb", "Apple", R.drawable.iphone12_mini_64gb),
        PhoneItem(28, " Iphone 12 Mini - 128gb", "Apple", R.drawable.iphone12_mini_128gb),
        PhoneItem(29, " Iphone 12 Mini - 256gb", "Apple", R.drawable.iphone_12_256gb),
        PhoneItem(30, " Iphone 12 Pro - 128gb", "Apple", R.drawable.iphone12_pro_128gb),
        PhoneItem(31, " Iphone 12 Pro - 256gb", "Apple", R.drawable.iphone_12_256gb),
        PhoneItem(32, " Iphone 12 Pro MAX - 512gb", "Apple", R.drawable.iphone12_pro_max_512gb),
        PhoneItem(33, " Iphone 13 - 128gb", "Apple", R.drawable.iphone13_128gb),
        PhoneItem(34, " Iphone 13 - 256gb", "Apple", R.drawable.iphone13_256gb),
        PhoneItem(35, " Iphone 13 - 512gb", "Apple", R.drawable.iphone13_512gb),
        PhoneItem(36, " Iphone 13 Mini - 128gb", "Apple", R.drawable.iphone13_mini),
        PhoneItem(37, " Iphone 13 Mini - 256gb", "Apple", R.drawable.iphone13_mini_256gb),
        PhoneItem(38, " Iphone 13 Mini - 512gb", "Apple", R.drawable.iphone13_mini_512gb),
        PhoneItem(39, " Iphone 13 PRO - 128gb", "Apple", R.drawable.iphone13_promax_128gb),
        PhoneItem(40, " Iphone 13 PRO - 256gb", "Apple", R.drawable.iphone13_256gb),
        PhoneItem(41, " Iphone 13 PRO - 512gb", "Apple", R.drawable.iphone13_512gb),
        PhoneItem(42, " Iphone 13 PRO - 1TB", "Apple", R.drawable.iphone13_promax_1tb),
        PhoneItem(43, " Iphone 13 PRO MAX - 128gb", "Apple", R.drawable.iphone13_promax_128gb),
        PhoneItem(44, " Iphone 13 PRO MAX - 256gb", "Apple", R.drawable.iphone13_promax_256gb),
        PhoneItem(45, " Iphone 13 PRO MAX - 512gb", "Apple", R.drawable.iphone13_promax_512gb),
        PhoneItem(46, " Iphone 13 PRO MAX - 1TB", "Apple", R.drawable.iphone13_promax_1tb),
        PhoneItem(47, " Iphone SE (2022) - 64gb", "Apple", R.drawable.iphone_se_64gb),
        PhoneItem(48, " Iphone SE (2022) - 128gb", "Apple", R.drawable.iphone_se_2020_128gb),
        PhoneItem(49, " Iphone SE (2022) - 256gb", "Apple", R.drawable.iphonese_256gb_2020),
        PhoneItem(50, " Iphone 14 - 128gb", "Apple", R.drawable.iphone14_128gb),
        PhoneItem(51, " Iphone 14 - 256gb", "Apple", R.drawable.iphone14_256gb),
        PhoneItem(52, " Iphone 14 - 512gb", "Apple", R.drawable.iphone14_512gb),
        PhoneItem(53, " Iphone 14 Plus - 128gb", "Apple", R.drawable.iphone14_plus_128gb),
        PhoneItem(54, " Iphone 14 Plus - 256gb", "Apple", R.drawable.iphone14_plus_256gb),
        PhoneItem(55, " Iphone 14 Plus- 512gb", "Apple", R.drawable.iphone14_promax_512gb),
        PhoneItem(56, " Iphone 14 Pro - 128gb", "Apple", R.drawable.iphone14_pro128gb),
        PhoneItem(57, " Iphone 14 Pro - 256gb", "Apple", R.drawable.iphone14_plus_256gb),
        PhoneItem(58, " Iphone 14 Pro - 512gb", "Apple", R.drawable.iphone14_pro_512gb),
        PhoneItem(59, " Iphone 14 Pro - 1TB", "Apple", R.drawable.iphone14_pro_1tb),
        PhoneItem(60, " Iphone 14 PRO MAX - 128gb", "Apple", R.drawable.iphone14_promax_128gb),
        PhoneItem(61, " Iphone 14 PRO MAX - 256gb", "Apple", R.drawable.iphone14_plus_256gb),
        PhoneItem(62, " Iphone 14 PRO MAX - 512gb", "Apple", R.drawable.iphone14_promax_512gb),
        PhoneItem(63, " Iphone 14 PRO MAX - 1TB", "Apple", R.drawable.iphone14_promax_1tb)
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




