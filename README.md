
github项目：https://github.com/binskys/AppTools
#AppTools 一些工具
一、状态栏功能 
设置状态栏透明
StatusBarUtils.setTranslucentStatus(this);

设置顶部状态栏颜色  
StatusBarUtils.setStatusBarColor(this, R.color.color_000);

设置状态栏文字颜色  黑色：true  白色：false
StatusBarUtils.setStatusBarDarkTheme(this, true);

设置底部虚拟键颜色  
StatusBarUtils.setNavigationBarColor(this, R.color.color_000);

Application 的 onCreate()方法添加
ToolManager.init(this);


继承依赖库
Step 1. Add the JitPack repository to your build file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

	
 Step 2. Add the dependency

 dependencies {
 	        implementation 'com.github.binskys:AppTools:v0.0.6'
 	}


----------------------状态栏功能 RN调用方法------------------------------
1、在项目根目录 创建 CommonModule.java 文件

package xxxx.xxxxxx;//你的文件路径（不包括文件名)如：com.rnapp

import android.text.TextUtils;

import com.example.rnmodule.Apps;
import com.example.rnmodule.app.PhoneAreaActivity;
import com.example.rnmodule.utils.MyUtil;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.module.common.eventbus.EBConstant;
import com.module.common.utils.basic.ToastUtils;

public class CommonModule extends ReactContextBaseJavaModule {

    private ReactContext mReactContext;
    private static final String COMMON_MODULE = "CommonModule";

    public CommonModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.mReactContext = reactContext;
    }

    @Override
    public String getName() {
        return COMMON_MODULE;
    }


    /**
     * toast
     */
    @ReactMethod
    public void toast(final String message) {
        if (!TextUtils.isEmpty(message)) {
            ToastUtils.toast(message);
        }
    }

    /**
     * 显示黑色字体
     */
    @ReactMethod
    public void blackFont() {
        MainApplication.getInstance().setEventBus(EBConstant.BLACK);
    }

    /**
     * 显示白色字体
     */
    @ReactMethod
    public void whiteFont() {
        MainApplication.getInstance().setEventBus(EBConstant.WHITE);

    }



2、在项目根目录 创建 CommonPackage.java 文件

package xxxx.xxxxxx;//你的文件路径（不包括文件名)如：com.rnapp
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 公共的Package
 * @author benny
 */
public class CommonPackage implements ReactPackage {

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new CommonModule(reactContext));
        return modules;
    }

}
}


3、在文件添加 MainApplication 中添加以下方法
 public void setEventBus(int i) {
        EventBus.getDefault().post(new EBMsgBean(i));

    }
    


4、在MainActivity 文件的 添加以下内容

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //注册事件
    if (!EventBus.getDefault().isRegistered(this)) {
        EventBus.getDefault().register(this);
    }
}
@Override
protected void onDestroy() {
    super.onDestroy();
    //取消事件注册
    EventBus.getDefault().unregister(this);
}
@Subscribe(threadMode = ThreadMode.MAIN)
public void onMsgEvent(EBMsgBean msgEvent) {
    onBaseMsgEvent(msgEvent);
}

private void onBaseMsgEvent(EBMsgBean msgEvent) {
    switch (msgEvent.getType()) {
        case EBConstant.BLACK:
            //状态栏黑色文字
            StatusBarUtils.setStatusBarDarkTheme(this, true);
            break;
        case EBConstant.WHITE:
            //状态栏白色文字
            StatusBarUtils.setStatusBarDarkTheme(this, false);
            break;
        default:
            break;
    }
}


---------------------------状态栏功能 RN调用方法*end---------------------------------------
 二、腾讯异常检测Bugly功能 
/**
* MultiDexApplication 或 Application都可以
*
*/
public class MainApplication extends extends MultiDexApplication implements ReactApplication  {
   *******
    @Override
    public void onCreate() {
        super.onCreate();
       BuglyUtils.init(this,buglyId);
    }
   *******
}

