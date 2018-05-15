package com.ribbon.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Service;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/5/15.
 */
@Service
@RibbonClient(name = "hello-service")
public interface RibbonService {

}
