package app.fynnjason.com.shenmayoupin.adapter

import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.Toast
import app.fynnjason.com.shenmayoupin.R
import app.fynnjason.com.shenmayoupin.bean.MineMenuInfoBean
import app.fynnjason.com.shenmayoupin.widget.WaveView
import com.allen.library.SuperTextView
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import java.util.*

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

class MultipleItemQuickAdapter
/**
 * Same as QuickAdapter#QuickAdapter(Context,int) but with
 * some initialization data.

 * @param data A new list is created out of this one to avoid mutable list
 */
(data: List<MultipleItem>) : BaseMultiItemQuickAdapter<MultipleItem, BaseViewHolder>(data) {
    init {
        addItemType(MultipleItem.TOP, R.layout.layout_mine_top)
        addItemType(MultipleItem.MID, R.layout.layout_mine_mid)
        addItemType(MultipleItem.BOTTOM, R.layout.layout_mine_bottom)
    }

    override fun convert(helper: BaseViewHolder, item: MultipleItem) {
        when (helper.itemViewType) {
            MultipleItem.TOP -> {
                val wv = helper.getView<WaveView>(R.id.wv_mine_top)
                val iv = helper.getView<ImageView>(R.id.iv_mine_top)
                val lp = FrameLayout.LayoutParams(150, 150)
                lp.gravity = Gravity.BOTTOM or Gravity.CENTER
                wv.setOnWaveAnimationListener { y ->
                    lp.setMargins(0, 0, 0, y.toInt() + 2)
                    iv.layoutParams = lp
                }
            }
            MultipleItem.MID -> {
                val tvBalance = helper.getView<SuperTextView>(R.id.tv_balance)
                tvBalance.leftTextView.text = "余额1000元"
                tvBalance.setOnClickListener { view -> Toast.makeText(mContext, "余额", Toast.LENGTH_SHORT).show() }
            }
            MultipleItem.BOTTOM -> {
                val menuList = ArrayList<MineMenuInfoBean>()
                menuList.add(MineMenuInfoBean("资金明细", R.drawable.evaluate2_33))
                menuList.add(MineMenuInfoBean("金币明细", R.drawable.evaluate2_36))
                menuList.add(MineMenuInfoBean("邀请好友", R.drawable.evaluate2_30))
                menuList.add(MineMenuInfoBean("店家中心", R.drawable.evaluate2_39))
                menuList.add(MineMenuInfoBean("收货地址", R.drawable.evaluate2_46))
                menuList.add(MineMenuInfoBean("卡券钱包", R.drawable.evaluate2_54))
                menuList.add(MineMenuInfoBean("在线客服", R.drawable.evaluate2_51))
                menuList.add(MineMenuInfoBean("帮助中心", R.drawable.evaluate2_49))
                val rv = helper.getView<RecyclerView>(R.id.rv_mine_bottom)
                rv.layoutManager = GridLayoutManager(mContext, 4)
                val menuAdapter = MineMenuAdapter(menuList)
                rv.adapter = menuAdapter
            }
        }
    }
}
