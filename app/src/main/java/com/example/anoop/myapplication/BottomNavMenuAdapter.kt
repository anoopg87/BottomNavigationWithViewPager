package com.example.anoop.myapplication

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.PagerAdapter

class BottomNavMenuAdapter(
    fm: FragmentManager,
    val menuItems: MutableList<BottomMenuItem>
) : FragmentStatePagerAdapter(fm) {

    override fun getItem(p: Int): Fragment {
       return menuItems[p].fragment
    }

    override fun getCount(): Int {
        return menuItems.size
    }

    override fun getItemPosition(`object`: Any): Int {
        return PagerAdapter.POSITION_NONE
    }

    fun replaceAt(index: Int, menuItem: BottomMenuItem) {
        menuItems.removeAt(index)
        menuItems.add(index, menuItem)
        notifyDataSetChanged()
    }

}