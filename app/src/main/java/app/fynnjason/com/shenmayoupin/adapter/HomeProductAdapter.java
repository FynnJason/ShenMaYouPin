package app.fynnjason.com.shenmayoupin.adapter;

import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.youth.banner.Banner;
import com.youth.banner.Transformer;

import java.util.List;

import app.fynnjason.com.shenmayoupin.R;
import app.fynnjason.com.shenmayoupin.bean.HomeDataBean;
import app.fynnjason.com.shenmayoupin.utils.BannerImageLoader;

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

public class HomeProductAdapter extends BaseQuickAdapter<HomeDataBean.ResultDataBean.RecommendProductsBean, BaseViewHolder> {
    public HomeProductAdapter(@Nullable List<HomeDataBean.ResultDataBean.RecommendProductsBean> data) {
        super(R.layout.item_home_product, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeDataBean.ResultDataBean.RecommendProductsBean item) {
        // 设置广告
        Banner mBanner = helper.getView(R.id.mBanner);
        mBanner.setImageLoader(new BannerImageLoader());
        mBanner.setBannerAnimation(Transformer.CubeIn);
        mBanner.setDelayTime(2000);
        mBanner.setImages(item.getBanners());
        mBanner.start();
        // 设置产品列表
        RecyclerView mRvProduct = helper.getView(R.id.rv_home_product_detail);
        mRvProduct.setLayoutManager(new GridLayoutManager(mContext, 2, LinearLayoutManager.VERTICAL, false));
        mRvProduct.setNestedScrollingEnabled(false);
        mRvProduct.setAdapter(new HomeProductDetailAdapter(item.getProducts()));

    }
}
