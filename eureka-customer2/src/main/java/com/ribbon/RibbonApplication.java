package com.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/15.
 */
@EnableEurekaClient

@SpringBootApplication
public class RibbonApplication {

    @Bean
    //该注解就是能够让RestTemplate启用客户端负载均衡。
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static  void main(String[] args){
        SpringApplication.run(RibbonApplication.class,args);
    }
}
