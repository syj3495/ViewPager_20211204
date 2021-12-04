package com.neppplus.viewpager_20211204

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.viewpager_20211204.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvent()
        setValues()

    }

    fun setupEvent(){


    }

    fun setValues(){

        mvpa = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mvpa

//      xml에 있는 탭레이아웃 / 뷰페이저 연결

        mainTapLayout.setupWithViewPager( mainViewPager )



    }

}