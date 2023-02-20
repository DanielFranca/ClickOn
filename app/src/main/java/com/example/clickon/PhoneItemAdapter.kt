package com.example.clickon

import PhoneItem
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class PhoneItemAdapter(context: Context, phoneItems: List<PhoneItem>) :
    ArrayAdapter<PhoneItem>(context, 0, phoneItems) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(
            R.layout.phone_item,
            parent,
            false
        )

        val phoneItem = getItem(position)

        view.findViewById<TextView>(R.id.text_phone).text = phoneItem.toString()
        phoneItem?.let { view.findViewById<ImageView>(R.id.image_phone).setImageResource(it.getFlagImage()) }

        return view
    }
}