package com.project.tools.basic;

import android.util.Log;

import com.project.tools.BuildConfig;

/**
 * @autry by benny
 * @date 2020/2/2 15:53
 * function
 */
public class LogUtils {
    private final static String LogTag="LogUtils";
    /**
     * debug
     *
     * @param s 打印日志调试信息
     */
    public static void d(String s) {
        if (BuildConfig.DEBUG && !CommonUtil.isEmpty(s)) {
            Log.d(LogTag, s);
        }
    }

    /**
     * info
     *
     * @param s 打印日志 信息
     */
    public static void i(String s) {
        if (BuildConfig.DEBUG && !CommonUtil.isEmpty(s)) {
            Log.i(LogTag, s);
        }
    }

    /**
     * error
     *
     * @param s 打印日志错误信息
     */
    public static void e(String s) {
        if (BuildConfig.DEBUG && !CommonUtil.isEmpty(s)) {
            Log.e(LogTag, s);
        }
    }
}
