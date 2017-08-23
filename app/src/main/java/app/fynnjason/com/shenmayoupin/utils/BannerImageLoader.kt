package app.fynnjason.com.shenmayoupin.utils

import android.content.Context
import android.widget.ImageView
import app.fynnjason.com.shenmayoupin.R
import com.bumptech.glide.Glide
import com.youth.banner.loader.ImageLoader

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */
class BannerImageLoader : ImageLoader() {
    override fun displayImage(context: Context?, path: Any?, imageView: ImageView?) {
        Glide.with(context).load(path).placeholder(R.mipmap.app_icon).crossFade(1000).into(imageView)
    }
}