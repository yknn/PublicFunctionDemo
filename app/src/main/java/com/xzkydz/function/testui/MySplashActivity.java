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

}
