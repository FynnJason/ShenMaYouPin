package app.fynnjason.com.shenmayoupin.store

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import app.fynnjason.com.shenmayoupin.R
import app.fynnjason.com.shenmayoupin.adapter.ViewPagerAdapter
import app.fynnjason.com.shenmayoupin.api.RequestNet
import app.fynnjason.com.shenmayoupin.bean.StoreProductTypeBean
import app.fynnjason.com.shenmayoupin.utils.BannerImageLoader
import com.bumptech.glide.Glide
import com.scwang.smartrefresh.header.CircleHeader
import com.scwang.smartrefresh.layout.footer.BallPulseFooter
import com.youth.banner.Transformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_store_product.*
import kotlinx.android.synthetic.main.layout_home_banner.*

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

class StoreProductFragment : Fragment(), ViewPager.OnPageChangeListener {
    override fun onPageScrollStateChanged(state: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
        mBanner.setFocusable(true)
        mBanner.setFocusableInTouchMode(true)
        mBanner.requestFocus()
    }

    val mRequest = RequestNet().getInstance()
    // 产品分类列表
    val typeList = ArrayList<StoreProductTypeBean.ResultDataBean>()
    // Fragment集合
    val fragmentList = ArrayList<Fragment>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_store_product, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requestBanner()
        requestType()
        initView()
    }

    /**
     * 请求产品分类
     */
    private fun requestType() {
        mRequest.getProductType()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    typeList.addAll(result.resultData)
                    configTab(result)
                })
    }

    /**
     * 设置分类TabLayout
     */
    private fun configTab(result: StoreProductTypeBean) {

        tab_store_product.tabMode = TabLayout.MODE_FIXED

        for ((position, i) in result.resultData.withIndex()) {
            val productFragment = StoreProductListFragment(vp_store_product)
            val bundle = Bundle()
            bundle.putInt("type_id", i.classSys0)
            bundle.putInt("position", position)
            productFragment.arguments = bundle
            fragmentList.add(productFragment)
        }

        val tabAdapter = ViewPagerAdapter(childFragmentManager, fragmentList)

        vp_store_product.adapter = tabAdapter

        tab_store_product.setupWithViewPager(vp_store_product)

        for ((index, i2) in result.resultData.withIndex()) {
            val view = LayoutInflater.from(context).inflate(R.layout.layout_store_product_type, null)
            var image = ImageView(context)
            var tv = TextView(context)
            image = view.findViewById(R.id.iv_top_img)
            tv = view.findViewById(R.id.tv_top_name)
            Glide.with(context).load(i2.classsys6).placeholder(R.mipmap.app_icon).into(image)
            tv.text = i2.classSys1
            tab_store_product.getTabAt(index)?.setCustomView(view)
        }

        vp_store_product.addOnPageChangeListener(this)
    }

    /**
     * 请求Banner
     */
    private fun requestBanner() {
        mRequest.getProductBanner()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    val bannerList = ArrayList<String>()
                    for (i in result.resultData) {
                        bannerList.add(i.link2)
                    }
                    mBanner.setBannerAnimation(Transformer.DepthPage)
                    mBanner.setImageLoader(BannerImageLoader())
                    mBanner.setImages(bannerList)
                    mBanner.setDelayTime(2000)
                    mBanner.start()
                }, { error -> Toast.makeText(context, "网络请求失败", Toast.LENGTH_SHORT).show() })
    }

    private fun initView() {
        refresh_store_product.setRefreshHeader(CircleHeader(context))
        refresh_store_product.setRefreshFooter(BallPulseFooter(context))
        refresh_store_product.setPrimaryColorsId(R.color.colorAccent)
        refresh_store_product.setOnRefreshListener { refreshlayout ->
            refresh_store_product.postDelayed({
                refreshlayout.finishRefresh()
                Toast.makeText(context, "刷新完成！", Toast.LENGTH_SHORT).show()
            }, 2000)
        }
        refresh_store_product.setOnLoadmoreListener { refreshlayout ->
            refresh_store_product.postDelayed({
                refreshlayout.finishLoadmore()
                Toast.makeText(context, "没有更多数据！", Toast.LENGTH_SHORT).show()
            }, 2000)
        }
    }
}
