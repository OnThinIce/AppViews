package com.zlcp.appviews.adapter;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zlcp.appviews.R;
import com.zlcp.appviews.entity.HomeItem;

import java.util.List;

/**
 * 作者：zl_freedom
 * 时间：2019/8/29 01:54
 * Note：
 */
public class MainAdapter extends BaseQuickAdapter<HomeItem, BaseViewHolder> {
    public MainAdapter(int layoutResId, @Nullable List<HomeItem> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, HomeItem item) {
        helper.setText(R.id.tv_title, item.getTitle());
        helper.setImageResource(R.id.iv_icon, item.getImageResource());
    }
}
