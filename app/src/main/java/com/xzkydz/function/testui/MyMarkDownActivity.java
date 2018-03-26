package com.xzkydz.function.testui;

import com.xzkydz.function.nav_menu.markdown.MarkDownActivity;

/**
 * Date: 2018/3/21  10:18
 * Description: 显示企业信息、产品信息。
 *   企业信息Markdown 文件默认显示在，产品信息需要设置文件的目录。
 */

public class MyMarkDownActivity extends MarkDownActivity {
    @Override
    public String setProductInfFileUrl() {
        return "markdown/ProductInf.md";
    }
}
