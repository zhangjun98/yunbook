package com.modo.useraddressservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.modo.useraddressservice.dao")
public class UserAddressServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserAddressServiceApplication.class, args);
    }

}
