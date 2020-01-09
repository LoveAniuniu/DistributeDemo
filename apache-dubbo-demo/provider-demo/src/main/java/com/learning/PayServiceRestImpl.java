package com.learning;

public class PayServiceRestImpl implements IPayRestService {
    @Override
    public String pay(String info) {

        System.out.println("execute pay:"+info);
        return "hello dubbo"+info;
    }
}
