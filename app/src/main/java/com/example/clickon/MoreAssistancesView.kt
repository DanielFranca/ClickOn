package com.example.clickon

import android.annotation.SuppressLint
import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.example.clickon.databinding.AssistancesItemBinding
import com.example.clickon.databinding.BannerItemBinding
import com.example.clickon.databinding.MoreAssistancesItemBinding
import com.squareup.picasso.Picasso

class MoreAssistancesView(viewGroup: ViewGroup) : ATViewHolder<MoreAssistances, MoreAssistancesItemBinding> (
    MoreAssistancesItemBinding::inflate,
    viewGroup

    ) {

        override fun bind(item: MoreAssistances) {
            Picasso.get()
                .load(item.bannerUrl)
                .into(binding.imgAssistances)
            binding.txtAssistances.text = item.text
            binding.txtStar.text = item.rate.toString()
            binding.txtSubtitle.text = itemView.context.getString(R.string.shop_category, item.category, item.distance)
            binding.txtPrice.text = itemView.context.getString(R.string.shop_price, item.time, item.price, )

        }


}
