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

class HomeClassifyAdapter(data: List<HomeDataBean.ResultDataBean.ClassifiedNavigationsBean>?) : BaseQuickAdapter<HomeDataBean.ResultDataBean.ClassifiedNavigationsBean, BaseViewHolder>(R.layout.item_home_classify, data) {

    override fun convert(helper: BaseViewHolder, item: HomeDataBean.ResultDataBean.ClassifiedNavigationsBean) {
        val img = helper.getView<ImageView>(R.id.iv_img)
        Glide.with(mContext).load(item.img).into(img)

        helper.setText(R.id.tv_name, item.title)
    }
}
