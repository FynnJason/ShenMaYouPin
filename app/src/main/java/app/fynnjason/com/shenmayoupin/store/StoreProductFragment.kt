package app.fynnjason.com.shenmayoupin.store

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.fynnjason.com.shenmayoupin.R

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

class StoreProductFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_store_product, container, false)
    }
}
