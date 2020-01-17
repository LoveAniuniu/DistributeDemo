package com.nnn.springbootdubboclient;

import com.nnn.ISayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(loadbalance = "random", mock = "com.nnn.springbootdubboclient.HelloServiceMock")
    private ISayHelloService sayHelloService;

    @GetMapping("/sayHello")
    public String sayHello(){

        return sayHelloService.sayHello();
    }
}
