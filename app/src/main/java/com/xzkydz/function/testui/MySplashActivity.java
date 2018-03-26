package com.xzkydz.function.testui;

import com.xzkydz.function.splash.SplashActivity;

/**
 * Date: 2018/3/21  11:12
 * Description:
 */
public class MySplashActivity extends SplashActivity {


    @Override
    public Class<?> getNavigationActivity() {
        return MyNavigationActivity.class;
    }


    @Override
    public void setShowContent() {
        super.setShowContent();
        setAppName("我是APP名称");
        setLawContent("我是法律内容");
        setVersionName("我是版本号");
    }

}
