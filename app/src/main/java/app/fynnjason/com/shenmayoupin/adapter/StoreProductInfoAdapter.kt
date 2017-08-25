package app.fynnjason.com.shenmayoupin.adapter

import android.widget.ImageView
import app.fynnjason.com.shenmayoupin.R
import app.fynnjason.com.shenmayoupin.bean.StoreProductInfoBean
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

class StoreProductInfoAdapter(data: List<StoreProductInfoBean.ResultDataBean.DtBean>?) : BaseQuickAdapter<StoreProductInfoBean.ResultDataBean.DtBean, BaseViewHolder>(R.layout.item_home_product_detail, data) {

    override fun convert(helper: BaseViewHolder, item: StoreProductInfoBean.ResultDataBean.DtBean) {
        val imageView = helper.getView<ImageView>(R.id.iv_product)
        Glide.with(mContext).load(item.picture).placeholder(R.mipmap.app_icon).into(imageView)

        helper.setText(R.id.tv_hot, item.tag)
                .setText(R.id.tv_content, item.name)
                .setText(R.id.tv_price, "¥${item.price}")
                .setText(R.id.tv_buy_number, "${item.quantityOfSale}人购买")
    }
}
