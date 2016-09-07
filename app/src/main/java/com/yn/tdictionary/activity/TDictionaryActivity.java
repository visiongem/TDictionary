package com.yn.tdictionary.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 主界面
 */
public class TDictionaryActivity extends BaseActivity {

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

    private Fragment[] tabFragments;
    private FragmentTransaction ft;
    private FragmentManager fm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fm = getSupportFragmentManager();
        tab1Fragment = Tab1Fragment.newInstance();
        tab2Fragment = Tab2Fragment.newInstance();
        tab3Fragment = Tab3Fragment.newInstance();
        tab4Fragment = Tab4Fragment.newInstance();
        tabFragments = new Fragment[]{tab1Fragment, tab2Fragment, tab3Fragment, tab4Fragment};

        // 这里一定要在save为null时才加载Fragment，Fragment中onCreateView等生命周里加载根子Fragment同理
        // 因为在页面重启时，Fragment会被保存恢复，而此时再加载Fragment会重复加载，导致重叠
        if (savedInstanceState == null) {
            // 这里加载根Fragment

            fm.beginTransaction()
                    .add(R.id.flayout_main_content, tab1Fragment, tab1Fragment.getClass().getName())
                    .add(R.id.flayout_main_content, tab2Fragment, tab2Fragment.getClass().getName())
                    .add(R.id.flayout_main_content, tab3Fragment, tab3Fragment.getClass().getName())
                    .add(R.id.flayout_main_content, tab4Fragment, tab4Fragment.getClass().getName())
                    .hide(tab2Fragment).hide(tab3Fragment).hide(tab4Fragment)
                    .commit();
        } else {
            // "内存重启"时调用
            tab1Fragment = (Tab1Fragment) fm.findFragmentByTag(Tab1Fragment.class.getName());
            tab2Fragment = (Tab2Fragment) fm.findFragmentByTag(Tab2Fragment.class.getName());
            tab3Fragment = (Tab3Fragment) fm.findFragmentByTag(Tab3Fragment.class.getName());
            tab4Fragment = (Tab4Fragment) fm.findFragmentByTag(Tab4Fragment.class.getName());
            // 解决重叠问题
            fm.beginTransaction()
                    .show(tab1Fragment)
                    .hide(tab2Fragment).hide(tab3Fragment).hide(tab4Fragment)
                    .commit();
        }

        viewsOnclick(llayoutTab1);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_tdictionary;
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
     *
     * @param index
     */
    private void tabBgChange(int index) {
        ft = fm.beginTransaction();
        for (int i = 0; i < mTitles.length; i++) {
            mImgTabs[i].setSelected(false);
            mTvTabs[i].setTextColor(ContextCompat.getColor(this, R.color.cyan_txt));
            ft.hide(tabFragments[i]);
        }
        ft.show(tabFragments[index]);
        ft.commit();
        mTvTabs[index].setTextColor(ContextCompat.getColor(this, R.color.blue));
        mImgTabs[index].setSelected(true);
    }
}
