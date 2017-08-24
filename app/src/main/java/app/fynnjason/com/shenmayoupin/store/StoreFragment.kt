package app.fynnjason.com.shenmayoupin.store

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.fynnjason.com.shenmayoupin.R
import kotlinx.android.synthetic.main.fragment_store.*

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */
class StoreFragment : Fragment() {

    //    // 2个Fragment
    val productFragment = StoreProductFragment()
    val integralFragment = StoreIntegralFragment()
    val fragmentList = ArrayList<Fragment>()
    // fragment管理器

    // 记录当前选择的Fragment
    var current: Int = 0

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_store, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initListener()
    }

    /**
     * 初始化视图
     */
    private fun initView() {
        // 默认产品商城为选中状态
        tv_store_left.isSelected = true
        // 加载Fragment
        fragmentList.add(productFragment)
        fragmentList.add(integralFragment)

        childFragmentManager.beginTransaction().add(R.id.store_contentContainer, productFragment).commit()
    }

    /**
     * 初始化监听事件
     */
    private fun initListener() {
        tv_store_left.setOnClickListener { view ->
            view.isSelected = true
            tv_store_right.isSelected = false
            selectFragment(0)
        }

        tv_store_right.setOnClickListener { view ->
            view.isSelected = true
            tv_store_left.isSelected = false
            selectFragment(1)
        }
    }

    /**
     * 选择点击的Fragment
     */
    private fun selectFragment(index: Int) {
        if (index != current) {
            val targetFragment = fragmentList.get(index)// 目标Fragment
            val currentFragment = fragmentList.get(current)// 当前Fragment
            if (!targetFragment.isAdded())
                childFragmentManager.beginTransaction().add(R.id.store_contentContainer, targetFragment).hide(currentFragment).commit()
            else
                childFragmentManager.beginTransaction().show(targetFragment).hide(currentFragment).commit()
            current = index // 记录当前fragment位置
        }
    }
}