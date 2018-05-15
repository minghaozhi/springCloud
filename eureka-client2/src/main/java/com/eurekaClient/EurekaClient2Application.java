package com.eurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/15.
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClient2Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient2Application.class, args);
    }
}
