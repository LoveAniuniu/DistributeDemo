package com.nnn.springbootdubboprovider;

import com.nnn.ISayHelloService;
import org.apache.dubbo.config.annotation.Service;

@Service(loadbalance = "roundrobin", weight = 10, cluster = "failfast")
public class SayHelloImpl implements ISayHelloService {
    @Override
    public String sayHello() {
        return "hello world";
    }
}
