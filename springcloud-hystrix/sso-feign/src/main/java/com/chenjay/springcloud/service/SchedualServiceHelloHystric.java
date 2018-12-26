package com.chenjay.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
