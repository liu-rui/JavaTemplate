package com.github.liurui.javatemplate;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liurui on 17-2-28.
 */
public class ServerItem {
    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ServerItem{" +
                "port=" + port +
                '}';
    }

    /**
     * Created by liurui on 17-2-28.
     */
    @Component
    @ConfigurationProperties(prefix = "cicada.rpc")
    public static class ServerConfiguration {
        private ServerItem server;
        private List<SourceItem> sources;


        public ServerItem getServer() {
            return server;
        }

        public void setServer(ServerItem server) {
            this.server = server;
        }

        public List<SourceItem> getSources() {
            return sources;
        }

        public void setSources(List<SourceItem> sources) {
            this.sources = sources;
        }
    }


    public static class SourceItem {
        private String contract;
        private String serviceFinderType;

        public String getContract() {
            return contract;
        }

        public void setContract(String name) {
            this.contract = name;
        }

        public String getServiceFinderType() {
            return serviceFinderType;
        }

        public void setServiceFinderType(String serviceFinderType) {
            this.serviceFinderType = serviceFinderType;
        }

        @Override
        public String toString() {
            return "SourceItem{" +
                    "contract='" + contract + '\'' +
                    ", serviceFinderType='" + serviceFinderType + '\'' +
                    '}';
        }
    }
}
