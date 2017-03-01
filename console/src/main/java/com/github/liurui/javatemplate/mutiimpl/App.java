package com.github.liurui.javatemplate.mutiimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.Assert;

/**
 * Created by liurui on 17-3-1.
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(com.github.liurui.javatemplate.App.class, args);

        A a = context.getBean(A.class);
        B b = context.getBean(B.class);

        Assert.isTrue(a.equals(b));
    }
}
