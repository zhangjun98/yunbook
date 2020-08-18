package com.modo.shoppinglistserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.modo.shoppinglistserver.dao")
public class ShoppingListServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingListServerApplication.class, args);
    }

}
