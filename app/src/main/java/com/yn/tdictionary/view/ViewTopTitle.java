package com.yn.tdictionary.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yn.tdictionary.R;

/**
 * 自定义组合控件标题栏
 * Created by admin on 2016/9/2.
 */
public class ViewTopTitle extends RelativeLayout {

    private ImageView imgBack;
    private TextView tvTitle;
    private boolean isImgBackShow = false;
    private String mTitle;

    public ViewTopTitle(Context context) {
        this(context, null);
    }

    public ViewTopTitle(Context context, AttributeSet attrs) {
        super(context, attrs);

        // 将自定义组合控件的布局渲染成View
        View view = View.inflate(context, R.layout.view_top_title, this);
        imgBack = (ImageView) view.findViewById(R.id.img_top_back);
        tvTitle = (TextView) view.findViewById(R.id.tv_top_title);

        //加载自定义的属性
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ViewTopTitle);
        isImgBackShow = a.getBoolean(R.styleable.ViewTopTitle_isImgBackShow, false);
        mTitle = a.getString(R.styleable.ViewTopTitle_topTitle);

        tvTitle.setText(mTitle);
        if (!isImgBackShow) {
            imgBack.setVisibility(View.GONE);
        }
    }

    /**
     * 设置按钮点击事件监听器
     * @param listener
     */
    public void setOnTopBackClickListener(OnClickListener listener) {
        imgBack.setOnClickListener(listener);
    }

}
