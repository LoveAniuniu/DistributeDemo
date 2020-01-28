package com.nnn.springbootnacosdemo;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;

import java.io.IOException;
import java.util.Properties;

public class NacosSdkDemo {

    public static void main(String[] args) throws NacosException, IOException {

        Properties properties = new Properties();
        properties.setProperty("serverAddr", "127.0.0.1:8848");

        ConfigService configService  = NacosFactory.createConfigService(properties);

        String context = configService.getConfig("example", "DEFAULT_GROUP", 3000);
        System.out.println(context);
        System.in.read();

    }
}
