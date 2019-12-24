package com.weweibuy.webuy.learning.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author durenhao
 * @date 2019/4/7 0:02
 **/
@EnableCaching
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.weweibuy.webuy.learning.spring.mapper"})
public class Application_Learning_Spring {

    public static void main(String[] args) {
        SpringApplication.run(Application_Learning_Spring.class, args);
    }

}
