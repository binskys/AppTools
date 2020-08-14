
# AppTools 一些工具
## 设置状态栏透明
StatusBarUtils.setTranslucentStatus(this);
## 设置顶部状态栏颜色  
StatusBarUtils.setStatusBarColor(this, R.color.color_000);
## 设置状态栏文字颜色  黑色：true  白色：false
StatusBarUtils.setStatusBarDarkTheme(this, true);
## 设置底部虚拟键颜色  
StatusBarUtils.setNavigationBarColor(this, R.color.color_000);
## Application 的 onCreate()方法添加
ToolManager.init(this);

##继承依赖库
###Step 1. Add the JitPack repository to your build file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
 ###Step 2. Add the dependency

 dependencies {
 	        implementation 'com.github.binskys:AppTools:v0.0.2'
 	}
