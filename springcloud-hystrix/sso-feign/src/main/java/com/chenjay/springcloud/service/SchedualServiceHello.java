package com.chenjay.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "serviceA",fallback = SchedualServiceHelloHystric.class)
public interface SchedualServiceHello {
    @GetMapping(value = "/hello")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

