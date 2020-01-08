package com.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboDemo {
    public static void main( String[] args ){
        ClassPathXmlApplicationContext
                classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext(new
                        String[]{"application.xml"});
        /*LoginService loginService=(LoginService)classPathXmlApplicationContext.getBean
                ("loginService");
        System.out.println(loginService.login("admin","admin"));*/
    }
}
