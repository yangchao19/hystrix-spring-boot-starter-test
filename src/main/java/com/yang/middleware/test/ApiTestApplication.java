package com.yang.middleware.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/12
 * @Copyright：
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.yang.middleware"})
public class ApiTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class,args);
    }
}
