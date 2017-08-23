package app.fynnjason.com.shenmayoupin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.KeyEvent
import android.widget.Toast
import app.fynnjason.com.shenmayoupin.home.HomeFragment
import app.fynnjason.com.shenmayoupin.mine.MineFragment
import app.fynnjason.com.shenmayoupin.shoppingcart.ShoppingCartFragment
import app.fynnjason.com.shenmayoupin.store.StoreFragment
import app.fynnjason.com.shenmayoupin.vip.VipFragment
import kotlinx.android.synthetic.main.activity_main.*

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */
class MainActivity : AppCompatActivity() {

    // 五个Fragment集合
    val bottomMenusList = ArrayList<Fragment>()
    // Fragment管理器
    var fragmentManager = supportFragmentManager
    // 记录当前选择的Fragment
    var current: Int = 0
    // 初始化Fragment
    val homeFragment = HomeFragment()
    val storeFragment = StoreFragment()
    val vipFragment = VipFragment()
    val shoppingCartFragment = ShoppingCartFragment()
    val mineFragment = MineFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            initView()
        }
    }

    /**
     * 初始化
     */
    private fun initView() {
        // 添加到容器中
        bottomMenusList.add(homeFragment)
        bottomMenusList.add(storeFragment)
        bottomMenusList.add(vipFragment)
        bottomMenusList.add(shoppingCartFragment)
        bottomMenusList.add(mineFragment)
        // 默认选择首页视图
        fragmentManager.beginTransaction().add(R.id.contentContainer, homeFragment).commit()

        menusListener()

    }

    /**
     * 底部菜单栏选择器监听
     */
    private fun menusListener() {
        bottomBar.setOnTabSelectListener { index: Int ->
            when (index) {
                R.id.tab_home -> selectFragment(0)
                R.id.tab_store -> selectFragment(1)
                R.id.tab_vip -> selectFragment(2)
                R.id.tab_shopping_cart -> selectFragment(3)
                R.id.tab_mine -> selectFragment(4)
            }
        }
    }

    /**
     * 选择点击的Fragment
     */
    private fun selectFragment(index: Int) {
        if (index != current) {
            val targetFragment = bottomMenusList.get(index)// 目标Fragment
            val currentFragment = bottomMenusList.get(current)// 当前Fragment
            if (!targetFragment.isAdded())
                fragmentManager.beginTransaction().add(R.id.contentContainer, targetFragment).hide(currentFragment).commit()
            else
                fragmentManager.beginTransaction().show(targetFragment).hide(currentFragment).commit()
            current = index // 记录当前fragment位置
        }
    }

    /**
     * 按两次退出程序
     */
    var exitTime: Long = 0

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && event?.getAction() == KeyEvent.ACTION_DOWN) {
            if (System.currentTimeMillis() - exitTime > 2000) {
                Toast.makeText(this, "再按一次退出程序！", Toast.LENGTH_SHORT).show()
                exitTime = System.currentTimeMillis()
            } else {
                finish()
            }
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

}
