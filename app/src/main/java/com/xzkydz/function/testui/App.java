package com.xzkydz.function.testui;

import com.xzkydz.function.app.KyApp;
import com.xzkydz.function.style.AppStyle;

/**
 * Date: 2018/3/21  10:31
 * Description:
 */

public class App extends KyApp {

    // 设置APP的名称、颜色
    @Override
    public void setAppStyleColor() {
        super.setAppStyleColor();
        //APP 名称
        AppStyle.appNameId = R.string.app_name;
        //APP 主题色
        AppStyle.appToolbarColor = R.color.colorPrimary;
    }
}
