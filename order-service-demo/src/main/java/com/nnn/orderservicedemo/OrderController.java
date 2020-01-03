package com.nnn.orderservicedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @GetMapping("/order")
    public String getOrder(){

        RestTemplate restTemplate = restTemplateBuilder.build();
        String url = "http://localhost:8081/repo/1";
        restTemplate.put(url, null, 10001);

        return "success";
    }
}
