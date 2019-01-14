package com.example.anoop.myapplication

import android.support.v4.app.Fragment

enum class BottomNavMenu(val res: Int) {
 MenuA(R.menu.menu_a), MenuB(R.menu.menu_b)
}


sealed class BottomMenuItem(val res: Int, val fragment: Fragment)
class Item1: BottomMenuItem(R.id.item1, Fragment1.newInstance())
class Item2: BottomMenuItem(R.id.item2, Fragment2.newInstance())
class Item3: BottomMenuItem(R.id.item3, Fragment3.newInstance())
class Item4: BottomMenuItem(R.id.item4, Fragment4.newInstance())
class Item5: BottomMenuItem(R.id.item5, Fragment5.newInstance())
class Item6: BottomMenuItem(R.id.item2, Fragment6.newInstance())

val menuItemA = listOf(Item1(), Item2(), Item3(), Item4(), Item5())
val menuItemB = listOf(Item1(), Item2(),  Item4(), Item5())