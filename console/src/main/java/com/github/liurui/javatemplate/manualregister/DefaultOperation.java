package com.github.liurui.javatemplate.manualregister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by liurui on 17-3-1.
 */
public class DefaultOperation implements TokenServer.Operation {

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Override
    public void execute() {
        System.out.println("手动注册的bean");
        System.out.println(applicationContext);
    }
}
