package com.hongrongtech.gateway.client;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("drools-service")
public class DroolsClient {
}
