package app.fynnjason.com.shenmayoupin.adapter

import android.widget.ImageView
import app.fynnjason.com.shenmayoupin.R
import app.fynnjason.com.shenmayoupin.bean.HomeDataBean
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

class HomeProductDetailAdapter(data: List<HomeDataBean.ResultDataBean.RecommendProductsBean.ProductsBean>?) : BaseQuickAdapter<HomeDataBean.ResultDataBean.RecommendProductsBean.ProductsBean, BaseViewHolder>(R.layout.item_home_product_detail, data) {

    override fun convert(helper: BaseViewHolder, item: HomeDataBean.ResultDataBean.RecommendProductsBean.ProductsBean) {
        val imageView = helper.getView<ImageView>(R.id.iv_product)
        Glide.with(mContext).load(item.img).placeholder(R.mipmap.app_icon).into(imageView)

        helper.setText(R.id.tv_hot, item.labelName)
                .setText(R.id.tv_content, item.name)
                .setText(R.id.tv_price, "¥" + item.price)
                .setText(R.id.tv_buy_number, item.purchase + "人购买")
    }
}
