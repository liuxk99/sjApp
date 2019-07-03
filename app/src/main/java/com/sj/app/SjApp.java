package com.sj.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;

import com.sj.utils.SjLog;
import com.sj.utils.SjLogGen;

public class SjApp extends Application {
    final String TAG = SjApp.class.getSimpleName();
    SjLogGen mLogGen = new SjLogGen(TAG);

    public SjApp() {
        super();
        SjLog log = mLogGen.build("SjApp()");
        log.in();
        {
        }
        log.out();
    }

    @Override
    public void onCreate() {
        SjLog log = mLogGen.build("onCreate()");
        log.in();
        {
            super.onCreate();
            MyUtils.sleepRandom(TAG);
        }
        log.out();
    }

    @Override
    public void onTerminate() {
        SjLog log = mLogGen.build("onTerminate()");
        log.in();
        {
            super.onTerminate();
        }
        log.out();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        SjLog log = mLogGen.build("onLowMemory()");
        log.in();
        {
            super.onLowMemory();
        }
        log.out();
    }

    @Override
    public void onTrimMemory(int level) {
        SjLog log = mLogGen.build("onTrimMemory(" + level + ")");
        log.in();
        {
            super.onTrimMemory(level);
        }
        log.out();
    }

    @Override
    public void registerComponentCallbacks(ComponentCallbacks callback) {
        super.registerComponentCallbacks(callback);
    }

    @Override
    public void unregisterComponentCallbacks(ComponentCallbacks callback) {
        super.unregisterComponentCallbacks(callback);
    }

    @Override
    public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.registerActivityLifecycleCallbacks(callback);
    }

    @Override
    public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.unregisterActivityLifecycleCallbacks(callback);
    }

    @Override
    public void registerOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
        super.registerOnProvideAssistDataListener(callback);
    }

    @Override
    public void unregisterOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
        super.unregisterOnProvideAssistDataListener(callback);
    }
}
