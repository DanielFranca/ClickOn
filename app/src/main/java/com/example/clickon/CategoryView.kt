package com.example.clickon

import android.graphics.drawable.GradientDrawable
import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.example.clickon.databinding.CategoryItemBinding
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso

class CategoryView(viewGroup: ViewGroup): ATViewHolder<Category, CategoryItemBinding> (
    CategoryItemBinding::inflate,
    viewGroup

) {
    override fun bind(item: Category) {
        binding.txtCategory.text = item.name

        Picasso.get()
            .load(item.logoUrl)
            .into(binding.imgCategory, object : Callback {
                override fun onSuccess() {
                    val shape = GradientDrawable()
                    shape.cornerRadius = 30f
                    binding.imgCategory.background = shape
                }

                override fun onError(e: Exception?) {

                }

            })
    }

}

