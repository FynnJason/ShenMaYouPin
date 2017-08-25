package app.fynnjason.com.shenmayoupin.api

import app.fynnjason.com.shenmayoupin.bean.HomeDataBean
import app.fynnjason.com.shenmayoupin.bean.StoreProductBannerBean
import app.fynnjason.com.shenmayoupin.bean.StoreProductInfoBean
import app.fynnjason.com.shenmayoupin.bean.StoreProductTypeBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */
interface ServiceApi {
    @GET("Index/HttpGetIndexData")
    fun getHomeData(): Observable<HomeDataBean>

    @GET("Product/GetProductBanner")
    fun getProductBanner(): Observable<StoreProductBannerBean>

    @GET("Product/GetProductType")
    fun getProductType(): Observable<StoreProductTypeBean>

    @GET("Product/GetProduct")
    fun getProduct(@Query("Page") page: Int, @Query("Size") size: Int, @Query("Type") type: Int): Observable<StoreProductInfoBean>
}