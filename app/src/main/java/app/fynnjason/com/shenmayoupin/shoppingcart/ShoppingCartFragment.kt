package app.fynnjason.com.shenmayoupin.shoppingcart

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
class ShoppingCartFragment :Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_shopping_cart,container,false)
    }
}