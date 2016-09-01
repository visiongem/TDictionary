package com.yn.tdictionary.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.orhanobut.logger.Logger;
import com.yn.tdictionary.utils.ActivityStackManager;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * activity基类
 * Created by yanni on 2016/6/8.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initDatas();
        ActivityStackManager.getInstance().addActivity(this);
    }

    /**
     * 得到布局
     */
    protected abstract int getLayoutId();

    /**
     * 初始化数据
     */
    protected abstract void initDatas();

    @Override
    protected synchronized void onDestroy() {
        ActivityStackManager.getInstance().removeActivity(this);
        super.onDestroy();
    }
}
