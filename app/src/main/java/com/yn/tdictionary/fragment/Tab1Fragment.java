package com.yn.tdictionary.fragment;


import com.yn.tdictionary.R;

/**
 * 字典
 * Created by yanni on 2016/7/11.
 */
public class Tab1Fragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.frag_tab1;
    }

    @Override
    protected void initData() {

    }

    public static Tab1Fragment newInstance() {
        return new Tab1Fragment();
    }

}
