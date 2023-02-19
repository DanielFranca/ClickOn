package com.example.clickon.pages

import HomeFragment
import PhoneFragment
import SearchFragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.clickon.FragmentsCategories.*
import com.example.clickon.R
import com.example.clickon.databinding.ActivityProductsBinding
import com.example.clickon.ui.Orders.OrdersFragment
import com.example.clickon.ui.Profile.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayoutMediator

class ProductsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductsBinding
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPager = binding.addViewpager

        val navView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        navView.setOnNavigationItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.nav_home -> fragment = HomeFragment()
                R.id.nav_search -> fragment = SearchFragment()
                R.id.nav_orders -> fragment = OrdersFragment()
                R.id.nav_profile -> fragment = ProfileFragment()
            }
            if (fragment != null) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container_products, fragment)
                    .commit()
                return@setOnNavigationItemSelectedListener true
            }
            false
        }

        setupViews()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("currentPosition", viewPager.currentItem)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val currentPosition = savedInstanceState.getInt("currentPosition")
        viewPager.currentItem = currentPosition
    }

    private fun setupViews() {
        val tabLayout = binding.addTab
        viewPager = binding.addViewpager
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



