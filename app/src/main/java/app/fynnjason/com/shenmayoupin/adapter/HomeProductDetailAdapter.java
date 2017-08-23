package app.fynnjason.com.shenmayoupin.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import app.fynnjason.com.shenmayoupin.R;
import app.fynnjason.com.shenmayoupin.bean.HomeDataBean;

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

public class HomeProductDetailAdapter extends BaseQuickAdapter<HomeDataBean.ResultDataBean.RecommendProductsBean.ProductsBean, BaseViewHolder> {
    public HomeProductDetailAdapter(@Nullable List<HomeDataBean.ResultDataBean.RecommendProductsBean.ProductsBean> data) {
        super(R.layout.item_home_product_detail, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeDataBean.ResultDataBean.RecommendProductsBean.ProductsBean item) {

    }
}
