package app.fynnjason.com.shenmayoupin.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by FengJun on 2016/12/29 0029.
 * TabLayout和ViewPager的适配器
 */

class ViewPagerAdapter(fm: FragmentManager, private val list_fragment: List<Fragment>
                       , private val list_String: List<String> = listOf()
) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return list_fragment[position]
    }

    override fun getCount(): Int {
        return list_fragment.size
    }

    //此方法用来显示tab上的名字
//    override fun getPageTitle(position: Int): CharSequence {
//        return list_String[position % list_String.size]
//    }
}
