package app.fynnjason.com.shenmayoupin.store

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import app.fynnjason.com.shenmayoupin.R
import app.fynnjason.com.shenmayoupin.adapter.StoreProductInfoAdapter
import app.fynnjason.com.shenmayoupin.api.RequestNet
import app.fynnjason.com.shenmayoupin.utils.LogUtils
import app.fynnjason.com.shenmayoupin.widget.WrapContentViewPager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_store_product_list.*

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

class StoreProductListFragment(viewPager: WrapContentViewPager) : Fragment(), ViewPager.OnPageChangeListener {
    override fun onPageScrollStateChanged(state: Int) {
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
        pager.resetHeight(position)
    }

    private var typeId = 0

    private var position = 0

    val pager = viewPager

    val mRequest = RequestNet().getInstance()


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        typeId = arguments.getInt("type_id")
        position = arguments.getInt("position")

        LogUtils.e(typeId.toString())
        return inflater!!.inflate(R.layout.fragment_store_product_list, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pager.setObjectForPosition(view, position)

        pager.addOnPageChangeListener(this)

        mRequest.getProduct(1, 10, typeId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    val productList = result.resultData.dt
                    rv_store_product_list.layoutManager = GridLayoutManager(context, 2)
                    rv_store_product_list.isNestedScrollingEnabled = false
                    val rvAdapter = StoreProductInfoAdapter(productList)
                    rv_store_product_list.adapter = rvAdapter

                }, { e -> Toast.makeText(context, "网络请求失败", Toast.LENGTH_SHORT).show() })
    }


}
