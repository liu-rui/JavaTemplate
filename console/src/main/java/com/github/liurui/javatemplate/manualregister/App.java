package com.github.liurui.javatemplate.manualregister;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
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
        ConfigurableListableBeanFactory factory = context.getBeanFactory();

        DefaultOperation bean = context.getBeanFactory().createBean(DefaultOperation.class);
        bean.execute();

        System.out.println(TokenServer.Operation.class.getName());
        factory.registerSingleton(TokenServer.Operation.class.getName(), bean);


        TokenServer.Operation bean1 = context.getBean(TokenServer.Operation.class);
        Assert.isTrue(bean.equals(bean1));
    }
}
