package app.fynnjason.com.shenmayoupin.adapter

import com.chad.library.adapter.base.entity.MultiItemEntity

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

class MultipleItem(private val itemType: Int) : MultiItemEntity {

    override fun getItemType(): Int {
        return itemType
    }

    companion object {
        val TOP = 1
        val MID = 2
        val BOTTOM = 3
    }
}
