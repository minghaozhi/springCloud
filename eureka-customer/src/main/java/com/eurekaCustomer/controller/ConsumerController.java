package com.eurekaCustomer.controller;

import com.eurekaCustomer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/15.
 */
@RestController
public class ConsumerController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/consumerHello/{name}")
    public String index(@PathVariable("name") String name){
        return helloService.sayHello(name);
    }

    @RequestMapping("/info")
    public String info(){
        return " Hi,I am a consumer!";
    }
}
