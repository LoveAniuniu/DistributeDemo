package com.nnn.springbootnacosdemo;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@NacosPropertySource(dataId = "example",groupId = "DEFAULT_GROUP", autoRefreshed = true)
@RestController
public class ConfigController {

    @NacosValue(value = "${info:no info}", autoRefreshed = true)
    private String info;

    @GetMapping("/get")
    public String get(){

        return info;
    }
}
