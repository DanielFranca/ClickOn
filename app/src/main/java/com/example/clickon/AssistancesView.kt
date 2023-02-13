package com.example.clickon

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.example.clickon.databinding.AssistancesItemBinding
import com.example.clickon.databinding.BannerItemBinding
import com.squareup.picasso.Picasso

class AssistancesView(viewGroup: ViewGroup) : ATViewHolder<Assistances, AssistancesItemBinding> (
    AssistancesItemBinding::inflate,
    viewGroup

    ) {
        override fun bind(item: Assistances) {
            Picasso.get()
                .load(item.assistancesUrl)
                .into(binding.imgAssistances)
            binding.txtAssistances.text = item.text
        }


}
