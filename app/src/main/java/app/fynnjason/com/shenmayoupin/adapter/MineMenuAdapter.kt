package app.fynnjason.com.shenmayoupin.adapter

import app.fynnjason.com.shenmayoupin.R
import app.fynnjason.com.shenmayoupin.bean.MineMenuInfoBean
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

class MineMenuAdapter(data: List<MineMenuInfoBean>) : BaseQuickAdapter<MineMenuInfoBean, BaseViewHolder>(R.layout.item_mine_menu, data) {

    override fun convert(helper: BaseViewHolder, item: MineMenuInfoBean) {
        helper.setText(R.id.menu_name, item.menuName)
                .setImageResource(R.id.menu_img, item.menuImg)
    }
}
