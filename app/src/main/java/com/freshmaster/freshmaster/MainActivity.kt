package com.freshmaster.freshmaster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_item1 -> {
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_item2 ->                         // Item 2 선택 시의 동작 처리
                    return@setOnNavigationItemSelectedListener true

                R.id.navigation_item3 ->                         // Item 3 선택 시의 동작 처리
                    return@setOnNavigationItemSelectedListener true

                R.id.navigation_item4 ->                         // Item 4 선택 시의 동작 처리
                    return@setOnNavigationItemSelectedListener true

                R.id.navigation_item5 ->                         // Item 5 선택 시의 동작 처리
                    return@setOnNavigationItemSelectedListener true
            }
            false
        }
    }
}

