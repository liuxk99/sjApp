package com.sj.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.sj.utils.SjLog;
import com.sj.utils.SjLogGen;

public class SjStaticReceiver extends BroadcastReceiver {
    final String TAG = SjStaticReceiver.class.getSimpleName();
    SjLogGen mLogGen = new SjLogGen(TAG);

    @Override
    public void onReceive(Context context, Intent intent) {
        SjLog log = mLogGen.build("onReceive(" + context + ", " + intent + ")");
        log.in();
        {

        }
        log.out();
    }
}
