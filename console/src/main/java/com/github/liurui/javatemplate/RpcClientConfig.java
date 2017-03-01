package com.github.liurui.javatemplate;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by liurui on 17-2-28.
 */
@Component
@ConfigurationProperties(prefix = "cicada.rpc")
public class RpcClientConfig {

}
