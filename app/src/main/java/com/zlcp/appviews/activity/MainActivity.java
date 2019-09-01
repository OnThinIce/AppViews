package com.zlcp.appviews.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.zlcp.appviews.R;
import com.zlcp.appviews.adapter.MainAdapter;
import com.zlcp.appviews.entity.HomeItem;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rv_main_list);
        initAdapter();
    }

    @SuppressWarnings("unchecked")
    private void initAdapter() {
        BaseQuickAdapter homeAdapter = new MainAdapter(R.layout.item_main_list, getHomeItemData());
        homeAdapter.openLoadAnimation();
        homeAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                HomeItem item = (HomeItem) adapter.getItem(position);
                Intent intent = new Intent(MainActivity.this, item.getActivity());
                startActivity(intent);
            }
        });
        mRecyclerView.setAdapter(homeAdapter);
    }

    private List<HomeItem> getHomeItemData() {
        return Arrays.asList(
                new HomeItem("八种角标", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("ConstraintLayout", Main3Activity.class, R.mipmap.ic_launcher),
                new HomeItem("转场动画", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher),
                new HomeItem("写个什么特效呢", Main2Activity.class, R.mipmap.ic_launcher)
        );
    }
}
