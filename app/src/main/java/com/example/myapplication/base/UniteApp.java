package com.example.myapplication.base;

import android.app.Application;
import com.example.myapplication.db.DBManager;
import org.xutils.x;

public class UniteApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //全局声明
        x.Ext.init(this);
        DBManager.initDB(this);
    }
}
