package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tableLayout = findViewById<TabLayout>(R.id.Tab_Layout)
        val viewPager2 = findViewById<ViewPager2>(R.id.View_Pager2)

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)

        viewPager2.adapter = adapter

        TabLayoutMediator(tableLayout,viewPager2){tab,position->
            when(position){
                0->{
                    tab.text = "Bentley"
                }
                1->{
                    tab.text = "Continental"
                }
                2->{
                    tab.text = "GT"
                }
            }
        }.attach()

    }
}