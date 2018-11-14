package com.example.hj.smile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    //页面集合
    val mFragments : Array<Fragment> = arrayOf()

    //menu集合
    var mCurrentIndex: Int by Delegates.observable(0) {
        _,_,new -> navigationView.setCheckedItem(when(new) {
        0 -> R.id.nav_text
        1 -> R.id.nav_pic
        2 -> R.id.nav_gif
        else -> R.id.nav_text
    })
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        setSupportActionBar(toolbar)
        val toogle = ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )

        drawerLayout.addDrawerListener(toogle)

        toogle.syncState()

        navigationView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
//                R.id.nav_text
            }
        }
    }

    private fun switchFragment(index: Int, title: String, item: MenuItem): Boolean {
        if(index != mCurrentIndex) {
            var trx = supportFragmentManager.beginTransaction()
//            trx.hide()
        }
    }


}
