package com.github.liurui.javatemplate.mutienv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liurui on 17-3-1.
 */
@Configuration
public class Config {
    @Value("${rabbit.address}")
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
