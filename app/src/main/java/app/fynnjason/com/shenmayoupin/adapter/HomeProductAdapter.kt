package app.fynnjason.com.shenmayoupin.adapter

import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import app.fynnjason.com.shenmayoupin.R
import app.fynnjason.com.shenmayoupin.bean.HomeDataBean
import app.fynnjason.com.shenmayoupin.utils.BannerImageLoader
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.youth.banner.Banner
import com.youth.banner.Transformer

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

class HomeProductAdapter(data: List<HomeDataBean.ResultDataBean.RecommendProductsBean>?) : BaseQuickAdapter<HomeDataBean.ResultDataBean.RecommendProductsBean, BaseViewHolder>(R.layout.item_home_product, data) {

    override fun convert(helper: BaseViewHolder, item: HomeDataBean.ResultDataBean.RecommendProductsBean) {
        // 设置广告
        val mBanner = helper.getView<Banner>(R.id.mBanner)
        mBanner.setImageLoader(BannerImageLoader())
        mBanner.setBannerAnimation(Transformer.CubeIn)
        mBanner.setDelayTime(2000)
        mBanner.setImages(item.banners)
        mBanner.start()
        // 设置产品列表
        val mRvProduct = helper.getView<RecyclerView>(R.id.rv_home_product_detail)
        mRvProduct.layoutManager = GridLayoutManager(mContext, 2, LinearLayoutManager.VERTICAL, false)
        mRvProduct.isNestedScrollingEnabled = false
        mRvProduct.adapter = HomeProductDetailAdapter(item.products)

    }
}
