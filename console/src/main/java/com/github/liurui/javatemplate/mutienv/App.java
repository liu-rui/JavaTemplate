package com.github.liurui.javatemplate.mutienv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by liurui on 17-3-1.
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        Config config = context.getBean(Config.class);

        System.out.println(config.getAddress());
    }
}
