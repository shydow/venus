package com.tangpian.demo.controller;

import com.tangpian.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(String name) {
        return demoService.say(name);
    }
}
