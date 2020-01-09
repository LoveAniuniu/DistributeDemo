package com.learning;

public class PayServiceImpl implements IPayService {
    @Override
    public String pay(String info) {

        System.out.println("execute pay:"+info);
        return "hello dubbo"+info;
    }
}
