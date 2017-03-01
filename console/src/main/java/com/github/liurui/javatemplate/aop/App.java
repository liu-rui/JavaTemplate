package com.github.liurui.javatemplate.aop;

import com.github.liurui.javatemplate.plugindev.ModuleInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

/**
 * Created by liurui on 17-3-1.
 */
@SpringBootApplication
public class App {


    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(com.github.liurui.javatemplate.App.class, args);
        Map<String, ModuleInterface> modules = context.getBeansOfType(ModuleInterface.class);


        for (Map.Entry<String, ModuleInterface> entry : modules.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
