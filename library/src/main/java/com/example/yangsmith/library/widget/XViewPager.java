package com.example.yangsmith.library.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Administrator on 2015/10/26.
 */
public class XViewPager extends ViewPager{

    private  boolean isEnableScrool = true;

    public XViewPager(Context context) {
        super(context);
    }

    public XViewPager(Context context, AttributeSet attrs) {
       super(context, attrs);
    }

    public  void setEnableScrool(boolean isEnableScrool){
        this.isEnableScrool = isEnableScrool;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (!isEnableScrool){
            return  false;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (!isEnableScrool){
            return  false;
        }
        return super.onTouchEvent(ev);
    }
}
