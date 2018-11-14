package com.example.hj.smile.module.text

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hj.smile.R
import com.example.hj.smile.module.text.joke.JokeFragment
import kotlinx.android.synthetic.main.fragment_pic.*

class TextFragment : Fragment() {
    val tabs: Array<String> = arrayOf("搞笑段子", "励志鸡汤")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_pic, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewPage.offscreenPageLimit = tabs.size
        mViewPage.adapter = TextPageAdapter(childFragmentManager)

    }

    private inner class TextPageAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
        override fun getCount(): Int {
            return tabs.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return tabs[position]
        }

        override fun getItem(p0: Int): Fragment {
            return when (p0) {
                0 -> JokeFragment()
                else -> JokeFragment()
            }
        }
    }

}