package com.example.yangsmith.ikonw;

import android.app.Application;

import com.example.yangsmith.library.base.BaseAppManager;

/**
 * Created by Administrator on 2015/10/26.
 */
public class IknowApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onLowMemory() {
        android.os.Process.killProcess(android.os.Process.myPid());
        super.onLowMemory();
    }

    public  void exitApp(){
        BaseAppManager.getInstance().clear();
        System.gc();
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
