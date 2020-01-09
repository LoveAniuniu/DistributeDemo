package com.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboDemo {
    public static void main( String[] args ){
        ClassPathXmlApplicationContext classPathXmlApplicationContext= new ClassPathXmlApplicationContext(new String[]{"application.xml"});

        IPayService payService = (IPayService) classPathXmlApplicationContext.getBean("payService");
        String info = payService.pay("test");

        System.out.println("hello world!"+info);
    }
}
