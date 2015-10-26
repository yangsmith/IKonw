package com.example.yangsmith.ikonw.ui;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ListView;

import com.example.yangsmith.ikonw.fragment.NavigationDrawerFragment;
import com.example.yangsmith.ikonw.R;
import com.example.yangsmith.ikonw.ui.base.BaseActivity;
import com.example.yangsmith.library.base.BaseAppCompatActivity;
import com.example.yangsmith.library.eventbus.EventCenter;
import com.example.yangsmith.library.netstatus.NetUtils;
import com.example.yangsmith.library.widget.XViewPager;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends BaseActivity {


    private  static long DOUBLE_CLICK_TIME = 0L;

    @InjectView(R.id.home_content)
    XViewPager mViewPager;

    @InjectView(R.id.home_drawer)
    DrawerLayout mDrawerLayout;

    @InjectView(R.id.home_navigation_list)
    ListView mNavListView;


    @Override
    protected boolean isApplyKitKatTranslucency() {
        return false;
    }

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return ButterKnife.findById(this,R.id.home_content);
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return true;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }
}
