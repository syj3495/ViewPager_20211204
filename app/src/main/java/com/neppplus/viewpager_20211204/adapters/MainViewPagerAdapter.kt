package com.neppplus.viewpager_20211204.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20211204.fragments.AddressFragment
import com.neppplus.viewpager_20211204.fragments.AgeFragment
import com.neppplus.viewpager_20211204.fragments.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        if(position == 0){
            return NameFragment()
        }else if(position == 1){
            return AddressFragment()
        }else{
            return AgeFragment()
        }

    }


}