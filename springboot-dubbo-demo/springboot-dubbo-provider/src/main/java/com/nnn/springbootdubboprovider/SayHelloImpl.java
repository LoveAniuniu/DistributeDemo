package com.nnn.springbootdubboprovider;

import com.nnn.ISayHelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class SayHelloImpl implements ISayHelloService {
    @Override
    public String sayHello() {
        return null;
    }
}
