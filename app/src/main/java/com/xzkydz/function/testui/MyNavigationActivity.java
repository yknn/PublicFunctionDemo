package com.xzkydz.function.testui;

import android.support.annotation.NonNull;

import com.xzkydz.function.main.NavigationActivity;
import com.xzkydz.function.main.style.NavigationActivityManager;
import com.xzkydz.function.main.style.NavigationActivityManagerInf;

/**
 * 继承 NavigationActivity 类
 */


public class MyNavigationActivity extends NavigationActivity {
    @Override
    public NavigationActivityManagerInf getNavigationActivityManager() {

//        int[] bgArray = {R.drawable.selector_navi_cs,
//                R.drawable.selector_navi_shjgl,
//                R.drawable.selector_navi_bgchx,
//                R.drawable.selector_navi_cshbzh,
//                R.drawable.selector_navi_chgq,
//                R.drawable.selector_navi_tc} ;

        //设置界面样式
        NavigationActivityManagerInf activityManager = new NavigationActivityManager();
        //设置左上角显示名称
        activityManager.setAppName(R.string.app_name);
        //侧边栏是否显示“打印”项
        activityManager.setShowPrints(true);
        //侧边栏显示配置项
        activityManager.setShowConfiguration(true);

//        设置主界面按钮的背景（选择器 ，如果对应切图的命名和库中的切图命名是一样的，则会自动替换项目中的切图）
//        activityManager.setMainButtonBg(bgArray);
//        设置主界面背景图
//        activityManager.setNavigationActivityBg(R.drawable.home_bg);
//        设置侧边栏顶部背景图
//        activityManager.setNavigationViewHeardBg(R.drawable.leftbar_top_bg);

        return activityManager;
    }


    @Override
    public void onTestButtonClickListener() {
        // 测试按钮点击事件
    }


    @Override
    public void onDataManagerClickListener() {
        // 数据管理按钮点击事件
    }

    @Override
    public void onSensorButtonClicklistener() {
        // 传感器按钮点击事件
    }

    @NonNull
    @Override
    public Class<?> getMarkdownActivity() {
        return MyMarkDownActivity.class;
    }

    /**
     * 如果显示“打印”选项，则复写此方法获取按钮的点击事件。如果不显示“打印”按钮，则无需复写此方法。
     */
    @Override
    public void onPrintsItemClickListener() {
        super.onPrintsItemClickListener();
    }
}
