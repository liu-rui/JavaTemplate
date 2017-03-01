package com.github.liurui.javatemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);


//        UserProperties properties = context.getBean(UserProperties.class);
//
//        System.out.println(properties.getServers());
//        System.out.println(properties.getBb());
//        System.out.println(properties.getCc());
//
//        System.out.println("--------------");
//
//        ServerItem.ServerConfiguration serverConfiguration = context.getBean(ServerItem.ServerConfiguration.class);
//
//        System.out.println(serverConfiguration.getServer());
//        System.out.println(serverConfiguration.getSources());


    }
}
