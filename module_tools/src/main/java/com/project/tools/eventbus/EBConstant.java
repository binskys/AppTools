package com.project.tools.eventbus;

/**
 * @author by benny
 * @date 2020/2/14 9:40
 * @desc EventBusConstant
 */

public class EBConstant {
    /**
     * 网络状态
     */
    public static final int NET_STATUS = 0;
    public static final int NET_STATUS_OK = 3;
    /**
     * 黑色文字
     **/
    public static final int BLACK = 1;
    /**
     * 白色文字
     */
    public static final int WHITE = 2;



    /**
     * 更新悬浮窗设置
     */
    public static final int FLOATING_SETTING = 4;

    /***返回后退*/
    public static int canGoBack = 5;

    /***打开无标题UI*/
    public static int openUINotTitle = 6;

    /**
     * 主动获取用户信息
     */
    public static final int GET_USER_INFO = 7;

    /***打开扫一扫方法*/
    public static int openScan = 8;

    /**
     * 推出登录
     **/
    public static final int LOGIN_OUT = 9;

    /**
     * 版本更新
     **/
    public static final int UPLOAD_APP = 10;

    /**
     * 选择交易所
     */
    public static final int SELECTOR_EXCHANGE = 11;

    /***充值*/
    public static final int DEPOSIT = 12;

    /**
     * 选择币种
     */
    public static final int SELECTOR_CURRENCY = 13;

    /**
     * 关闭原生UI
     */
    public static final int CLOSE_UI = 14;

    /**
     * 跟单成功
     **/
    public static final int DOCUMENTARY_SUCCESS = 15;

    /**
     * 显示加载条
     */
    public static final int SHOW_LOADING = 17;
    /**
     * 异地登录
     */
    public static final int REMOTE_LOGIN = 18;

    /**
     * 重启APP
     * */
    public static final int RECREATE = 19;

    /**
     * 切换语言
     * */
    public static final int SWITCH_LANGUAGE = 20;

    /**
     * 隐藏加载条
     */
    public static final int HIDE_LOADING = 100;

    /**
     * 交易所授权成功
     */
    public static final int ACCESS_SUCCESS = 101;
    /*** 邀请分享 */
    public static final int SHARE_INVITE = 102;

    /***销毁UI */
    public static final int DESTROY_UI = 103;

    /**
     * K线详情 蜡烛走势图
     */
    public static final int PUSH_TYPE_1 = 104;
    /**
     * K线详情 最新成交，一笔一笔的推送
     */
    public static final int PUSH_TYPE_2 = 105;
    /**
     * 判断是否开启指纹验证
     */
    public static final int CHECK_FINGERPRINT = 106;
    /**
     * 判断是否开启手势验证
     */
    public static final int CHECK_GESTURE = 107;
    /**
     * 登录设置
     */
    public static final int LOGIN_SETTING = 108;

    /*** 分享应用 */
    public static final int SHARE_APP = 109;
}
