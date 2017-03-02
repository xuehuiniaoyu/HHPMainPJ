package com.example.HHPMain;

import android.os.Bundle;
import com.huan.hhp.App_configActivity;

/**
 *  主工程主要用来加载插件，加载的方法有两种:
 *  第一种是直接加载并显示在当前Activity，如果使用这种方式就需要继承  App_configActivity 实现。
 *  还有一种方式是在新页面中打开插件，方法是通过PluginManager.runPlugin
 */

public class MainActivity extends App_configActivity {
    // 插件ID (和插件包名无关，只要唯一)
    private String pkg = "com.huan.hhp.example-module";
    // 插件配置文件的地址
    private String uri = "http://172.10.10.211:8080/HHybridPlugin/HHPModule/app_config.xml";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setApp_config(pkg, uri);
    }
}
