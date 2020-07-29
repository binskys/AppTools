package com.project.tools.basic;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.project.tools.R;
import com.project.tools.ToolManager;


/**
 * Toast统一管理类
 */
public class ToastUtils {
    private static Toast toast;
    public static boolean isToast = true;

    /**
     * 短时间Toast
     *
     * @param message 消息
     */
    public static void toast(String message) {
        try {
            if (!isToast) {
                return;
            }
            //showXToast(message);
            if (!TextUtils.isEmpty(getText(message))) {
                if (Build.VERSION.SDK_INT >= 28) {
                    //9.0以上toast直接用原生的方法即可，并不用setText防止重复的显示的问
                    //下列写法：是为了解决部分手机的提示语 前面 会出现  包名。  例如：  "创成汇：请输入密码"
                    showToastP(message);
                    //  showXToast(message);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    showToastO(message);
                    //  showXToast(message);
                } else {
                    if (toast == null) {
                        toast = Toast.makeText(ToolManager.getInstance(), message, Toast.LENGTH_SHORT);
                    } else {
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setText(message);
                    }
                    toast.show();
                }
            }
        } catch (Exception e) {
            LogUtils.d("ToastUtils:" + e.getMessage());
        }
    }

    private static String getText(String message) {
        if (TextUtils.isEmpty(message)) {
            return "";
        }
        String e1=ToolManager.getInstance().getString(R.string.str_empty8194);
        String e2=ToolManager.getInstance().getString(R.string.str_empty8195);
        if (message.length() == 3) {
            message = e1 + message +e1;
        } else if (message.length() == 2) {
            message = e2 + message +e2;
        }else if (message.length() == 1) {
            message = e2 +e1 + message +e2+e1;
        }
        return message;
    }

    private static void showToastP(String message) {
        Toast toast = Toast.makeText(ToolManager.getInstance(), "", Toast.LENGTH_SHORT);
        toast.setText(message);
        toast.show();
    }

    private static void showToastO(String message) {
        Toast toast = Toast.makeText(ToolManager.getInstance(), "", Toast.LENGTH_SHORT);
        toast.setText(message);
        toast.show();
    }

    private static void showXToast(String message) {

    }


    /**
     * 自定义Toast ( 在顶部显示)
     *
     * @param context
     * @param message 提示内容
     */
    public static void showTopToast(Context context, String message) {
//        //加载Toast布局
//        View toastRoot = LayoutInflater.from(context).inflate(R.layout.toast_top_view, null);
//        //初始化布局控件
//        TextView mTextView = (TextView) toastRoot.findViewById(R.id.toast_top_tvMessage);
//        //为控件设置属性
//        mTextView.setText(message);
//        //Toast的初始化
//        Toast toastStart = new Toast(context);
//        //获取屏幕高度
//        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
//        toastStart.setGravity(Gravity.TOP | Gravity.FILL_HORIZONTAL, 0, 0);
//        toastStart.setDuration(Toast.LENGTH_SHORT);
//        toastStart.setView(toastRoot);
//        toastStart.show();
    }

}
