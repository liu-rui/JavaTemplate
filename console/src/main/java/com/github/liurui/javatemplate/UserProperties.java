package com.github.liurui.javatemplate;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("my")
public class UserProperties {
    private List<String> servers = new ArrayList<String>();
    private List<String> bb = new ArrayList<String>();
    private String cc;

    public List<String> getServers() {
        return this.servers;
    }


    public List<String> getBb() {
        return bb;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}
