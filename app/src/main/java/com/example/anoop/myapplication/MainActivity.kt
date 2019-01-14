package com.example.anoop.myapplication

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var  isMenuA: Boolean = true
    lateinit var adapter: BottomNavMenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadView()
    }

    private fun loadView(){
        val menu = if(isMenuA) BottomNavMenu.MenuA else BottomNavMenu.MenuB
        val menuItems = if(isMenuA) menuItemA else menuItemB
        adapter = BottomNavMenuAdapter(supportFragmentManager,menuItems.toMutableList())
        mainViewPager.adapter = adapter
        bottomNavMenu.inflateMenu(menu.res)

        mainViewPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(p0: Int) {}
            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {}
            override fun onPageSelected(pos: Int) {
                bottomNavMenu.selectedItemId = adapter.menuItems[pos].res
            }

        })
        bottomNavMenu.setOnNavigationItemSelectedListener { item ->
            mainViewPager.currentItem = adapter.menuItems.indexOfFirst { it.res ==  item.itemId}
            return@setOnNavigationItemSelectedListener true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.add_another_fragment, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.item6) {
            adapter.replaceAt(1, Item6())
        }
        return true
    }
}
