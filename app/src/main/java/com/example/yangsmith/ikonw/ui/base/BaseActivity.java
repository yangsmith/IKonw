package com.example.yangsmith.ikonw.ui.base;


import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.yangsmith.ikonw.IknowApplication;
import com.example.yangsmith.ikonw.R;
import com.example.yangsmith.ikonw.view.base.BaseView;
import com.example.yangsmith.library.base.BaseAppCompatActivity;

import butterknife.ButterKnife;


/**
 * Created by Administrator on 2015/10/26.
 */
public abstract  class BaseActivity extends BaseAppCompatActivity implements BaseView {


    protected Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isApplyKitKatTranslucency()){
            setSystemBarTintDrawable(getResources().getDrawable(R.drawable.sr_primary));
        }
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        mToolbar = ButterKnife.findById(this,R.id.common_bar);
        if (null != mToolbar){
            setSupportActionBar(mToolbar);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    protected IknowApplication getBaseApplication(){
        return  (IknowApplication)getApplication();
    }

    @Override
    public void showLoading(String msg) {
        toggleShowLoading(true,null);
    }

    @Override
    public void hideLoading() {
        toggleShowLoading(false,null);
    }

    @Override
    public void showError(String msg) {
       toggleShowError(true,msg,null);
    }

    @Override
    public void showException(String msg) {
        toggleShowError(true,msg,null);
    }

    @Override
    public void showNetError() {
       toggleNetworkError(true,null);
    }

    protected abstract boolean isApplyKitKatTranslucency();
}
