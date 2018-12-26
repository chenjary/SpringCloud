package com.chenjay.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://serviceA/hello?name="+name,String.class);
    }

    public String helloError(String name) {
        return "hello,"+name+",sorry,error!";
    }
}

