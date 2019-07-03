package com.sj.app;

import android.util.Log;

import com.sj.utils.SjMath;

public class MyUtils {

    static void sleepRandom(String TAG) {
        long time = SjMath.calcRandomTime();
        try {
            Log.d(TAG, "sleep: " + time + "(ms)");
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
