package app.fynnjason.com.shenmayoupin.store

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.fynnjason.com.shenmayoupin.R
import kotlinx.android.synthetic.main.fragment_store.*

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */
class StoreFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_store, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
    }

    private fun initListener() {
        tv_store_left.setOnClickListener { view ->
            view.isSelected = true
            tv_store_right.isSelected = false
        }

        tv_store_right.setOnClickListener { view ->
            view.isSelected = true
            tv_store_left.isSelected = false
        }
    }
}