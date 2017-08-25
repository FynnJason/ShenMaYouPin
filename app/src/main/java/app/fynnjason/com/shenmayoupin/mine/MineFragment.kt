package app.fynnjason.com.shenmayoupin.mine

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.fynnjason.com.shenmayoupin.R
import app.fynnjason.com.shenmayoupin.adapter.MultipleItem
import app.fynnjason.com.shenmayoupin.adapter.MultipleItemQuickAdapter
import kotlinx.android.synthetic.main.fragment_mine.*

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */
class MineFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_mine, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_mine.layoutManager = LinearLayoutManager(context)
        val dataList = listOf<MultipleItem>(MultipleItem(1), MultipleItem(2), MultipleItem(3))
        val mineAdapter = MultipleItemQuickAdapter(dataList)
        rv_mine.adapter = mineAdapter
    }
}