package com.yn.tdictionary.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yn.tdictionary.R;
import com.yn.tdictionary.fragment.Tab1Fragment;
import com.yn.tdictionary.fragment.Tab2Fragment;
import com.yn.tdictionary.fragment.Tab3Fragment;
import com.yn.tdictionary.fragment.Tab4Fragment;
import com.yn.tdictionary.utils.ToastMaker;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 主界面
 */
public class MainActivity extends BaseActivity {

    @BindView(R.id.flayout_main_content)
    FrameLayout flayoutContent;

    @BindView(R.id.img_tab1)
    ImageView imgTab1;
    @BindView(R.id.tv_tab1)
    TextView tvTab1;
    @BindView(R.id.llayout_tab1)
    LinearLayout llayoutTab1;

    @BindView(R.id.img_tab2)
    ImageView imgTab2;
    @BindView(R.id.tv_tab2)
    TextView tvTab2;
    @BindView(R.id.llayout_tab2)
    LinearLayout llayoutTab2;

    @BindView(R.id.img_tab3)
    ImageView imgTab3;
    @BindView(R.id.tv_tab3)
    TextView tvTab3;
    @BindView(R.id.llayout_tab3)
    LinearLayout llayoutTab3;

    @BindView(R.id.img_tab4)
    ImageView imgTab4;
    @BindView(R.id.tv_tab4)
    TextView tvTab4;
    @BindView(R.id.llayout_tab4)
    LinearLayout llayoutTab4;

    private TextView[] mTvTabs;
    private ImageView[] mImgTabs;
    private String[] mTitles = new String[]{"新华字典", "成语词典", "发现", "更多"};

    private Tab1Fragment tab1Fragment;
    private Tab2Fragment tab2Fragment;
    private Tab3Fragment tab3Fragment;
    private Tab4Fragment tab4Fragment;
    private FragmentTransaction ft;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fragmentManager = getSupportFragmentManager();

        // 这里一定要在save为null时才加载Fragment，Fragment中onCreateView等生命周里加载根子Fragment同理
        // 因为在页面重启时，Fragment会被保存恢复，而此时再加载Fragment会重复加载，导致重叠
        if(savedInstanceState == null){
            // 这里加载根Fragment
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initDatas() {

        mTvTabs = new TextView[]{tvTab1, tvTab2, tvTab3, tvTab4};
        mImgTabs = new ImageView[]{imgTab1, imgTab2, imgTab3, imgTab4};

    }

    @OnClick({R.id.llayout_tab1, R.id.llayout_tab2, R.id.llayout_tab3, R.id.llayout_tab4})
    public void viewsOnclick(View view) {
        switch (view.getId()) {
            case R.id.llayout_tab1:
                tabBgChange(0);
                break;

            case R.id.llayout_tab2:
                tabBgChange(1);
                break;

            case R.id.llayout_tab3:
                tabBgChange(2);
                break;

            case R.id.llayout_tab4:
                tabBgChange(3);
                break;
        }
    }

    /**
     * tab切换
     * @param index
     */
    private void tabBgChange(int index){
        for (int i = 0; i < mTitles.length; i++){
            mImgTabs[i].setSelected(false);
            mTvTabs[i].setTextColor(ContextCompat.getColor(this, R.color.gray));
        }
        mTvTabs[index].setTextColor(ContextCompat.getColor(this, R.color.blue));
        mImgTabs[index].setSelected(true);
    }
}
