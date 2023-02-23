package com.example.clickon.Cards.CardsPhone

import PhoneItem
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.clickon.DiagnosticGeral.PhoneDetailsActivityScreen
import com.example.clickon.R

class PhoneListAdapter(
    private val phonesApple: List<PhoneItem>
) : RecyclerView.Adapter<PhoneListAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.phone_item, parent, false)
        return Holder(itemView)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val phone = phonesApple[position]

        holder.phoneImage.setImageResource(phone.getFlagImage())
        holder.phoneName.text = phone.phoneName


        holder.itemView.setOnClickListener {
            val phoneItem = phonesApple.getOrNull(position) // obtém o PhoneItem clicado
            phoneItem?.let {
                val intent = Intent(holder.itemView.context, PhoneDetailsActivityScreen::class.java)
                intent.putExtra(
                    holder.itemView.context.getString(R.string.phone_model),
                    it.phoneName
                )
                holder.itemView.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount() = phonesApple.size

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val phoneImage: ImageView = itemView.findViewById(R.id.image_phone)
        val phoneName: TextView = itemView.findViewById(R.id.text_phone)

    }
}