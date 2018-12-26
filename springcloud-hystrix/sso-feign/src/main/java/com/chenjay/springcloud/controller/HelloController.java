package com.chenjay.springcloud.controller;

import com.chenjay.springcloud.service.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    SchedualServiceHello schedualServiceHello;
    @GetMapping(value = "/hello")
    public String Hello(@RequestParam String name){
        return schedualServiceHello.sayHiFromClientOne(name);
    }
}


