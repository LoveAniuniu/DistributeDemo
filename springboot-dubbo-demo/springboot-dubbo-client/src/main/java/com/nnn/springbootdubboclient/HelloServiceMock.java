package com.nnn.springbootdubboclient;

import com.nnn.ISayHelloService;

public class HelloServiceMock implements ISayHelloService {

    @Override
    public String sayHello() {
         return "服务被降级";
    }
}
