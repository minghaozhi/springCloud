package com.eurekaCustomer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/15.
 */
@Service
//name:远程服务名，即spring.application.name配置的名称
@FeignClient(name="hello-service")
public interface HelloService {
    //需要匹配服务提供者接口名称
    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam(value="name") String name);
}
