package app.fynnjason.com.shenmayoupin.api

import app.fynnjason.com.shenmayoupin.bean.HomeDataBean
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */
interface ServiceApi {
    @GET("Index/HttpGetIndexData")
    fun getHomeData(): Observable<HomeDataBean>


}