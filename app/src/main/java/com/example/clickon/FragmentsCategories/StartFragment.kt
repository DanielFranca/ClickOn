package com.example.clickon.FragmentsCategories

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import co.tiagoaguiar.atway.ui.adapter.ATAdapter
import com.example.clickon.*
import com.example.clickon.databinding.FragmentStartBinding

class StartFragment : Fragment(R.layout.fragment_start) {

    private var binding: FragmentStartBinding? = null

    private val categoryAdapter = ATAdapter({
        CategoryView(it)
    })
    private val bannerAdapter = ATAdapter({ BannerView(it)})

    private val filters = arrayOf(
        FilterItem(1,"Ordenar",  closeIcon = R.drawable.ic_keyboard_arrow ),
        FilterItem(2,"Para retirar", icon = R.drawable.ic_baseline_directions_walk_24),
        FilterItem(3,"Perto de mim", icon = R.drawable.ic_keyboard_arrow),
        FilterItem(4,"Entrega grátis", icon = R.drawable.ic_back),
        FilterItem(5, "Ofertas", icon = R.drawable.ic_offer),
        FilterItem(6, "Filtros", closeIcon = R.drawable.ic_filter_list)
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryAdapter.items = arrayListOf( //não está sendo usado por enquanto
            Category(1, "https://media.licdn.com/dms/image/C4D22AQEyOzUpgbTmlA/feedshare-shrink_1280/0/1669147593672?e=1678320000&v=beta&t=P4HaOA87JDB5HhC4I_yglyzwRhbOdnSTnUkUGQ8QCz0", "Assistências", 0x3b69fa),
            Category(2, "https://media.licdn.com/dms/image/C4D22AQEyOzUpgbTmlA/feedshare-shrink_1280/0/1669147593672?e=1678320000&v=beta&t=P4HaOA87JDB5HhC4I_yglyzwRhbOdnSTnUkUGQ8QCz0", "Shopping", 0x3b69fa),
            Category(3, "https://media.licdn.com/dms/image/C4D22AQEyOzUpgbTmlA/feedshare-shrink_1280/0/1669147593672?e=1678320000&v=beta&t=P4HaOA87JDB5HhC4I_yglyzwRhbOdnSTnUkUGQ8QCz0", "Promoções", 0x3b69fa),
            Category(3, "https://media.licdn.com/dms/image/C4D22AQEyOzUpgbTmlA/feedshare-shrink_1280/0/1669147593672?e=1678320000&v=beta&t=P4HaOA87JDB5HhC4I_yglyzwRhbOdnSTnUkUGQ8QCz0", "Diagnóstico", 0x3b69fa),
            )

        bannerAdapter.items = arrayListOf(
            Banner(1, "https://media.licdn.com/dms/image/C4D22AQEyOzUpgbTmlA/feedshare-shrink_1280/0/1669147593672?e=1678320000&v=beta&t=P4HaOA87JDB5HhC4I_yglyzwRhbOdnSTnUkUGQ8QCz0"),
            Banner(2, "https://media.licdn.com/dms/image/C4D22AQEyOzUpgbTmlA/feedshare-shrink_1280/0/1669147593672?e=1678320000&v=beta&t=P4HaOA87JDB5HhC4I_yglyzwRhbOdnSTnUkUGQ8QCz0"),
            Banner(3, "https://media.licdn.com/dms/image/C4D22AQEyOzUpgbTmlA/feedshare-shrink_1280/0/1669147593672?e=1678320000&v=beta&t=P4HaOA87JDB5HhC4I_yglyzwRhbOdnSTnUkUGQ8QCz0"),
            Banner(4, "https://media.licdn.com/dms/image/C4D22AQEyOzUpgbTmlA/feedshare-shrink_1280/0/1669147593672?e=1678320000&v=beta&t=P4HaOA87JDB5HhC4I_yglyzwRhbOdnSTnUkUGQ8QCz0")
        )

        binding = FragmentStartBinding.bind(view)

        binding?.let {

            it.rvCategory.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            it.rvCategory.adapter = categoryAdapter

            it.rvBanners.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            it.rvBanners.adapter = bannerAdapter
            it.rvBanners.addOnScrollListener(object : RecyclerView.OnScrollListener(){
                override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                    if(newState == RecyclerView.SCROLL_STATE_IDLE) {
                        notifyPositionChanged(recyclerView)
                    }

                    }
                })


            addDots(it.dots, bannerAdapter.items.size, 0)

            filters.forEach { filter ->
               it.chipGroupFilter.addView(filter.toChip(requireContext()))
           }
        }


    }

    private fun addDots(container: LinearLayout, size: Int, position: Int) {
        container.removeAllViews()

        Array(size) {
            val textView = TextView(context).apply {
                text = getString(R.string.dotted)
                textSize = 35f
                setTextColor(
                    if(position == it) ContextCompat.getColor(context, android.R.color.black)
                    else ContextCompat.getColor(context, android.R.color.darker_gray)
                )
            }
            container.addView(textView)
        }
    }

    private var position: Int? = RecyclerView.NO_POSITION
    private val snapHelper = LinearSnapHelper()

    private fun notifyPositionChanged(recyclerView: RecyclerView) {
        val layoutManager = recyclerView.layoutManager
        val view = snapHelper.findSnapView(layoutManager)
        val position = if (view == null) RecyclerView.NO_POSITION else layoutManager?.getPosition(view)

        val positionChanged = this.position != position
        if(positionChanged) {
            addDots(binding!!.dots, bannerAdapter.items.size, position ?: 0)
        }
        this.position = position
    }
}
