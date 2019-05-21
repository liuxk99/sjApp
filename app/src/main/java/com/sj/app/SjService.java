package com.sj.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.sj.utils.SjLog;
import com.sj.utils.SjLogGen;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class SjService extends Service {
    final String TAG = SjService.class.getSimpleName();
    SjLogGen mLogGen = new SjLogGen(TAG);

    public SjService() {
    }

    @Override
    public void onCreate() {
        SjLog log = mLogGen.build("onCreate()");
        log.in();
        {
            super.onCreate();
        }
        log.out();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        SjLog log = mLogGen.build("onStart(" + intent + ", " + startId + ")");
        log.in();
        {
            super.onStart(intent, startId);
        }
        log.out();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int res = 0;
        SjLog log = mLogGen.build("onStartCommand(" + intent + ", " + flags + ", " + startId + ")");
        log.in();
        {
            res = super.onStartCommand(intent, flags, startId);
        }
        log.out();
        return res;
    }

    @Override
    public void onDestroy() {
        SjLog log = mLogGen.build("onDestroy()");
        log.in();
        {
            super.onDestroy();
        }
        log.out();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override
    protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(fd, writer, args);
    }
}
