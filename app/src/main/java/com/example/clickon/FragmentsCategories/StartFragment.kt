package com.example.clickon.FragmentsCategories

import android.annotation.SuppressLint
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

    private val categoryAdapter = ATAdapter({ CategoryView(it)})
    private val bannerAdapter = ATAdapter({ BannerView(it)})
    private val assistancesAdapter = ATAdapter({AssistancesView(it)})

    private val filters = arrayOf(
        FilterItem(2,"Para retirar", icon = R.drawable.ic_baseline_directions_walk_24),
        FilterItem(3,"Perto de mim", icon = R.drawable.ic_keyboard_arrow),
        FilterItem(4,"Entrega grátis", icon = R.drawable.ic_back),
        FilterItem(5, "Ofertas", icon = R.drawable.ic_offer),
    )

    override fun onResume() {
        super.onResume()
        categoryAdapter.notifyDataSetChanged()
        bannerAdapter.notifyDataSetChanged()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryAdapter.items = arrayListOf( //não está sendo usado por enquanto
            Category(1, "https://lh3.googleusercontent.com/u/0/drive-viewer/AAOQEOTiFRo5ict3LbUVNviosA9I1tFzquHOpf5Y0rOPmWqan3BpKgsFPPFA98X8o0uwMRhmhU6GiJfG4MatZsdb__cJ_xp4VA=w1359-h599", "Assistências"),
            Category(2, "https://lh3.googleusercontent.com/u/0/drive-viewer/AAOQEOSoRILnWKPzl9ONCRxCWL7ypQXXH9qc_xUDzC3NgAOYXBUR4NFVOMT-4xzPWIZRuNWzIUcr-b7n-EiiWq9JaJz5YMjgfw=w1359-h599","Shopping"),
            Category(3, "https://lh3.googleusercontent.com/u/0/drive-viewer/AAOQEOSnq8AED1vIXGzEHEGXshGQVmxaD-9Byv1peDe_iCtr7IQsipA1lMtYmEXmEshzILjbEyt01JvC3r8td-1DrpWU-6Ve=w1359-h599", "Promoções"),
            Category(4, "https://lh3.googleusercontent.com/u/0/drive-viewer/AAOQEOQBAprbPfZ5DTQzhCylxp5D5EKVpOL5uRSnsOf8FveIkJPnmIZ4_6mkNmYop7PEIZSWjcrz46rlYn9kfT0qFUcI5Q61MQ=w1359-h599", "Diagnóstico"),
            )

        bannerAdapter.items = arrayListOf(
            Banner(1, "https://lh3.googleusercontent.com/u/0/drive-viewer/AAOQEOTnBkIbNwjFpDvrZJtyIR7-uFvx_8ULp5nX_N_bbWQery2GbyyBVmhmpTyLVPiYHa7hJ0zj6L6l4HdU5h_qtKdtlyWKAg=w1359-h599"),
            Banner(2, "https://media.licdn.com/dms/image/C4D22AQEyOzUpgbTmlA/feedshare-shrink_1280/0/1669147593672?e=1678320000&v=beta&t=P4HaOA87JDB5HhC4I_yglyzwRhbOdnSTnUkUGQ8QCz0"),
            Banner(3, "https://media.licdn.com/dms/image/C4D22AQEyOzUpgbTmlA/feedshare-shrink_1280/0/1669147593672?e=1678320000&v=beta&t=P4HaOA87JDB5HhC4I_yglyzwRhbOdnSTnUkUGQ8QCz0"),
            Banner(4, "https://media.licdn.com/dms/image/C4D22AQEyOzUpgbTmlA/feedshare-shrink_1280/0/1669147593672?e=1678320000&v=beta&t=P4HaOA87JDB5HhC4I_yglyzwRhbOdnSTnUkUGQ8QCz0")
        )

        assistancesAdapter.items = arrayListOf(
            Assistances(1, "https://lh3.googleusercontent.com/u/0/drive-viewer/AAOQEOTnBkIbNwjFpDvrZJtyIR7-uFvx_8ULp5nX_N_bbWQery2GbyyBVmhmpTyLVPiYHa7hJ0zj6L6l4HdU5h_qtKdtlyWKAg=w1359-h599", "ClickOn Celulares" ),
            Assistances(2, "https://lh3.googleusercontent.com/u/0/drive-viewer/AAOQEOTnBkIbNwjFpDvrZJtyIR7-uFvx_8ULp5nX_N_bbWQery2GbyyBVmhmpTyLVPiYHa7hJ0zj6L6l4HdU5h_qtKdtlyWKAg=w1359-h599", "ClickOn Celulares" ),
            Assistances(3, "https://lh3.googleusercontent.com/u/0/drive-viewer/AAOQEOTnBkIbNwjFpDvrZJtyIR7-uFvx_8ULp5nX_N_bbWQery2GbyyBVmhmpTyLVPiYHa7hJ0zj6L6l4HdU5h_qtKdtlyWKAg=w1359-h599", "ClickOn Celulares" ),
            Assistances(4, "https://lh3.googleusercontent.com/u/0/drive-viewer/AAOQEOTnBkIbNwjFpDvrZJtyIR7-uFvx_8ULp5nX_N_bbWQery2GbyyBVmhmpTyLVPiYHa7hJ0zj6L6l4HdU5h_qtKdtlyWKAg=w1359-h599", "ClickOn Celulares" ),
            Assistances(5, "https://lh3.googleusercontent.com/u/0/drive-viewer/AAOQEOTnBkIbNwjFpDvrZJtyIR7-uFvx_8ULp5nX_N_bbWQery2GbyyBVmhmpTyLVPiYHa7hJ0zj6L6l4HdU5h_qtKdtlyWKAg=w1359-h599", "ClickOn Celulares" )
        )


        binding = FragmentStartBinding.bind(view)

        binding?.let {

            it.rvCategory.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            it.rvCategory.adapter = categoryAdapter

            it.rvAssistances.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            it.rvAssistances.adapter = assistancesAdapter


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


    private fun notifyPositionChanged(recyclerView: RecyclerView) {
        val centerView = recyclerView.findChildViewUnder(
            recyclerView.width / 2.0f,
            recyclerView.height / 2.0f
        )

        centerView?.let {
            val position = recyclerView.getChildAdapterPosition(centerView)
            binding?.dots?.let { it1 -> addDots(it1, bannerAdapter.items.size, position) }
        }
    }
}
