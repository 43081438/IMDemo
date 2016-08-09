package com.example.administrator.imtest.global;

import android.app.Application;

import com.example.administrator.imtest.util.ConnectionHelper;

/**
 * 类名称：
 * 类描述：
 * 创建人：quzongyang
 * 创建时间：2016/8/5. 16:38
 * 版本：
 */
public class BaseApplication extends Application {
//
//    private XXConnection connection;
//
//    public XXConnection getLongConn() {
//        return connection;
//    }
//
//    public void setLongConn(XXConnection connection) {
//        this.connection = connection;
//    }

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            ConnectionHelper.startService(this);
        } catch (Exception _e) {
            _e.printStackTrace();
        }
    }
}
