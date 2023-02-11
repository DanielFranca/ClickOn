package com.example.clickon.pages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.clickon.FragmentsCategories.*
import com.example.clickon.R
import com.example.clickon.databinding.ActivityProductsBinding
import com.example.clickon.ui.Orders.OrdersFragment
import com.example.clickon.ui.Profile.ProfileFragment
import com.example.clickon.ui.Search.SearchFragment
import com.example.clickon.ui.home.HomeFragment
import com.example.clickon.ui.services.ServicesFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayoutMediator

class ProductsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductsBinding
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViews()
    }

    private fun setupViews() {
        val tabLayout = binding.addTab
        val viewPager = binding.addViewpager
        val adapter = tabViewPagerAdapter(this)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = getString(adapter.tabs[position])
        }.attach()
    }
}
    class tabViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

        val tabs = arrayOf(
            R.string.inicio,
            R.string.celular,
            R.string.computador,
            R.string.tablet,
            R.string.express
        )
        private val fragments = arrayOf(
            StartFragment(),
            PhoneFragment(),
            ComputerFragment(),
            TabletFragment(),
            ExpressFragment()
        )

        override fun getItemCount() = fragments.size

        override fun createFragment(position: Int): Fragment {
            return fragments[position]
        }

    }

    class assistanceFragment : Fragment()

    class startFragment : Fragment()

