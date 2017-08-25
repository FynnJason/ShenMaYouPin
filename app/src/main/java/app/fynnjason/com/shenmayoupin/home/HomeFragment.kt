package app.fynnjason.com.shenmayoupin.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import app.fynnjason.com.shenmayoupin.R
import app.fynnjason.com.shenmayoupin.adapter.HomeClassifyAdapter
import app.fynnjason.com.shenmayoupin.adapter.HomeProductAdapter
import app.fynnjason.com.shenmayoupin.api.RequestNet
import app.fynnjason.com.shenmayoupin.bean.HomeDataBean
import app.fynnjason.com.shenmayoupin.utils.BannerImageLoader
import com.bumptech.glide.Glide
import com.scwang.smartrefresh.header.DeliveryHeader
import com.youth.banner.Transformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.layout_home_banner.*
import kotlinx.android.synthetic.main.layout_home_classify.*
import kotlinx.android.synthetic.main.layout_home_news.*

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */
class HomeFragment : Fragment() {

    // 广告集合
    val mBannerList = ArrayList<String>()
    // 网络请求体
    val mRequestNet = RequestNet().getInstance()
    // 分类导航数据集合
    val classifyList = ArrayList<HomeDataBean.ResultDataBean.ClassifiedNavigationsBean>()
    // 分类导航的适配器
    val classifyAdapter = HomeClassifyAdapter(classifyList)
    // 产品数据集合
    val productList = ArrayList<HomeDataBean.ResultDataBean.RecommendProductsBean>()
    // 产品数据的适配器
    val productAdapter = HomeProductAdapter(productList)

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // 解决焦点
        mBanner.setFocusable(true)
        mBanner.setFocusableInTouchMode(true)
        mBanner.requestFocus()

        initView()
        requestHomeData()
    }

    private fun initView() {
        // 分类导航列表初始化
        rv_home_classify.isNestedScrollingEnabled = false
        rv_home_classify.layoutManager = GridLayoutManager(context, 4)
        rv_home_classify.adapter = classifyAdapter
        // 产品列表初始化
        rv_home_product.isNestedScrollingEnabled = false
        rv_home_product.layoutManager = LinearLayoutManager(context)
        rv_home_product.adapter = productAdapter
        // 刷新控件初始化
        mRefresh.setRefreshHeader(DeliveryHeader(context))
        mRefresh.setPrimaryColorsId(R.color.colorAccent)
        mRefresh.setOnRefreshListener { refreshlayout ->
            mRefresh.postDelayed({
                refreshlayout.finishRefresh()
                Toast.makeText(context, "刷新完成！", Toast.LENGTH_SHORT).show()
            }, 2000)
        }
    }

    /**
     * 请求首页数据
     */
    private fun requestHomeData() {
        mRequestNet.getHomeData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    mBannerList.addAll(result.resultData.banners)
                    configBanner()
                    configNews(result)
                    configVip(result)
                    configClassify(result)
                    configProduct(result)
                }, { error -> Toast.makeText(context, "网络请求失败", Toast.LENGTH_SHORT).show() })
    }

    /**
     * 设置产品列表
     */
    private fun configProduct(result: HomeDataBean) {
        productList.addAll(result.resultData.recommendProducts)
        productAdapter.notifyDataSetChanged()
    }

    /**
     * 设置分类导航列表
     */
    private fun configClassify(result: HomeDataBean) {
        classifyList.addAll(result.resultData.classifiedNavigations)
        classifyAdapter.notifyDataSetChanged()
    }

    /**
     * 设置会员广告
     */
    private fun configVip(result: HomeDataBean) {
        Glide.with(context).load(result.resultData.vipExclusive).placeholder(R.mipmap.app_icon).crossFade(2000).into(iv_home_vip)
    }

    /**
     * 设置神马头条
     */
    private fun configNews(result: HomeDataBean) {
        tv_home_news_1.setText(result.resultData.godHorses[0].title)
        tv_home_news_2.setText(result.resultData.godHorses[1].title)

    }

    /**
     * 设置广告栏
     */
    private fun configBanner() {
        mBanner.setImageLoader(BannerImageLoader())
        mBanner.setImages(mBannerList)
        mBanner.setBannerAnimation(Transformer.Accordion)
        mBanner.setDelayTime(2000)
        mBanner.start()

    }

}