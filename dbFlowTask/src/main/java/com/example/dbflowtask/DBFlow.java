package com.example.dbflowtask;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

public class DBFlow extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
