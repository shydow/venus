package com.tangpian.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String say(String name) {
        return "hello, " + name;
    }
}
