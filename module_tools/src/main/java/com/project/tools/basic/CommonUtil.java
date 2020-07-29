package com.project.tools.basic;

import android.text.TextUtils;

import com.project.tools.ToolManager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @autry by benny
 * @date 2020/2/2 15:51
 * function
 */
public class CommonUtil {

    /**
     * 判断字符串是否为空
     * @param s
     * @return
     */
    public static boolean isEmpty(String s) {
        if (null == s || TextUtils.isEmpty(s) || "null".equals(s)||" ".equals(s)) {
            return true;
        }
        return false;
    }

    /**
     * 手机号  中间四位是用 *****  代替
     */
    public static String getAccountEnc(String account) {
        if (isEmpty(account)) {
            return "";
        } else if (!isEmpty(account) && account.length() == 11) {
            account = account.substring(0, 3) + "****"
                    + account.substring(7, account.length());
        }
        return account;
    }


    /**
     * 获取状态栏高度
     * @return
     */
    public static int getStatusBarHeight() {
        int result = 0;
        int resourceId = ToolManager.getInstance().getResources().getIdentifier(
                "status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = ToolManager.getInstance().getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    /***
     * 判断字符串是数字
     * @param str
     * @return
     */
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }




    // 两次点击按钮之间的点击间隔不能少于1000毫秒
    private static final int MIN_CLICK_DELAY_TIME = 1000;
    private static long lastClickTime;

    /**
     * 是否可以点击
     * @return  true:为可以点击
     */
    public static boolean isFastClick() {
        boolean flag = false;
        long curClickTime = System.currentTimeMillis();
        if ((curClickTime - lastClickTime) >= MIN_CLICK_DELAY_TIME) {
            flag = true;
        }
        lastClickTime = curClickTime;
        return flag;
    }

}
