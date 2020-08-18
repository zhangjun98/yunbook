package com.modo.storebookserv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.modo.storebookserv.dao")
public class StoreBookServApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreBookServApplication.class, args);
    }

}
