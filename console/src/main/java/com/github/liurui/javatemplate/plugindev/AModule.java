package com.github.liurui.javatemplate.plugindev;

import org.springframework.stereotype.Component;

/**
 * Created by liurui on 17-3-1.
 */
@Component
public class AModule implements ModuleInterface {
    @Override
    public void init() {
        System.out.println("a 模块已经初始化");
    }
}
