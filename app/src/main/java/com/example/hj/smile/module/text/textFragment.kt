package com.example.hj.smile.module.text

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hj.smile.R

class TextFragment : Fragment() {
    val tabs: Array<String> = arrayOf("搞笑段子", "励志鸡汤")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_pic, container, false)
    }
}