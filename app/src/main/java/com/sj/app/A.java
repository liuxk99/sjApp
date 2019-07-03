package com.sj.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

import com.sj.utils.SjLog;
import com.sj.utils.SjLogGen;

public class A extends Activity {
    final String TAG = A.class.getSimpleName();
    SjLogGen mLogGen = new SjLogGen(TAG);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SjLog sjLog = mLogGen.build("onCreate(" + savedInstanceState + ")");
        sjLog.in();
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            TextView textView = findViewById(R.id.textView);
            textView.setText(TAG);

            new RuntimeException("here").fillInStackTrace().printStackTrace();
        }
        sjLog.out();
    }

    final IntentFilter mFilter = new IntentFilter("sj.intent.action.ACTION_DYNAMIC");
    final BroadcastReceiver mReceiver = new SjDynamicReceiver();

    @Override
    protected void onPause() {
        SjLog sjLog = mLogGen.build("onPause()");
        sjLog.in();
        {
            unregisterReceiver(mReceiver);

            MyUtils.sleepRandom(TAG);
            super.onPause();
        }
        sjLog.out();
    }


    @Override
    protected void onResume() {
        SjLog sjLog = mLogGen.build("onResume()");
        sjLog.in();
        {
            super.onResume();

            registerReceiver(mReceiver, mFilter);
        }
        sjLog.out();
    }
}
