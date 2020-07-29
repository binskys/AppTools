package com.project.tools;

import android.app.Application;

/**
 * @author by benny
 * @date 2020/7/29 14:18
 * @功能:
 */

public class ToolManager {
    public static Application instance;

    public static Application getInstance() {
        return instance;
    }

    public void init(Application application) {
        instance = application;
    }
}
