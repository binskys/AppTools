package com.example.demo;

import android.app.Application;

import com.project.tools.ToolManager;

/**
 * @author by benny
 * @date 2020/7/29 15:11
 * @功能:
 */

public class ToolsApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ToolManager.init(this);
    }
}
