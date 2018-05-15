package com.eurekaCustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/15.
 */
//@EnableEurekaClient :启用服务注册与发现
//@EnableFeignClients：启用feign进行远程调用
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class EurekaCustomerApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaCustomerApplication.class,args);
    }
}
