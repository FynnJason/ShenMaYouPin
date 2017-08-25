package app.fynnjason.com.shenmayoupin.api

import app.fynnjason.com.shenmayoupin.bean.HomeDataBean
import app.fynnjason.com.shenmayoupin.bean.StoreProductBannerBean
import app.fynnjason.com.shenmayoupin.bean.StoreProductInfoBean
import app.fynnjason.com.shenmayoupin.bean.StoreProductTypeBean
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */
class RequestNet : ServiceApi {
    override fun getProduct(page: Int, size: Int, type: Int): Observable<StoreProductInfoBean> {
        return serviceApi.getProduct(page, size, type)
    }


    override fun getProductType(): Observable<StoreProductTypeBean> {
        return serviceApi.getProductType()
    }


    override fun getProductBanner(): Observable<StoreProductBannerBean> {
        return serviceApi.getProductBanner()
    }

    val BASE_URL = "http://app.shenmayoupin.com/api/"

    override fun getHomeData(): Observable<HomeDataBean> {
        return serviceApi.getHomeData()
    }

    private var serviceApi: ServiceApi

    @Volatile private var requestNet: RequestNet? = null

    constructor() {
        val client = OkHttpClient.Builder()
                .addNetworkInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(10, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build()

        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build()

        serviceApi = retrofit.create(ServiceApi::class.java)
    }

    fun getInstance(): RequestNet {
        if (requestNet == null) {
            synchronized(RequestNet::class.java) {
                if (requestNet == null) {
                    requestNet = RequestNet()
                }
            }
        }
        return this
    }

}