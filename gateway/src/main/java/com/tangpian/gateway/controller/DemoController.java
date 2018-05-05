package com.tangpian.gateway.controller;

import com.tangpian.gateway.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/say")
    public String say(@RequestParam String name) {
        return demoService.say(name);
    }
}
