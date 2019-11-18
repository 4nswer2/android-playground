package com.example.android.javaplayground;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;

public class SampleService extends Service {

    // static initializer
    static {
        d("[static initializer]");
    }

    // instance initializer
    {
        d("[instance initializer]");
    }

    // constructor
    public SampleService() {
        d("[constructor]");
    }

    @Override
    public void onCreate() {
        d("[onCreate]");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        d("[onDestroy]");
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private static void d(String message) {
        Log.d("__DEBUG__", message);
    }
}
