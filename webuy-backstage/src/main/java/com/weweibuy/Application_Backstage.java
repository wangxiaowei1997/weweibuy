package com.weweibuy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @ClassName Application
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/21 23:07
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.weweibuy.webuy.product.client")
@EnableHystrix
@EnableRetry
@MapperScan(basePackages = {"com.weweibuy.mapper"})
@EnableCaching
public class Application_Backstage {

    public static void main(String[] args) {
        SpringApplication.run(Application_Backstage.class, args);
    }

}
