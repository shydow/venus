package com.tangpian.gateway.service;

import com.tangpian.gateway.client.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private DemoClient demoClient;

    public String say(String name) {
        return demoClient.say(name);
    }
}
