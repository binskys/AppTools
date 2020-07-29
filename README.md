# AppTools
AppTools 一些工具
#设置状态栏透明
StatusBarUtils.setTranslucentStatus(this);
#设置底部虚拟键颜色  黑色：true  白色：false
 StatusBarUtils.setStatusBarColor(this, R.color.color_000);
#设置状态栏文字颜色  黑色：true  白色：false
StatusBarUtils.setStatusBarDarkTheme(this, true);
#设置底部虚拟键颜色  黑色：true  白色：false
StatusBarUtils.setNavigationBarColor(this, R.color.color_000);

 
# Application 的 onCreate()方法添加
ToolManager.init(this);