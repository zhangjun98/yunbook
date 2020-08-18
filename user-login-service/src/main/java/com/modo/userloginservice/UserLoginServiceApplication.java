package com.modo.userloginservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.modo.userloginservice.dao")
public class UserLoginServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserLoginServiceApplication.class, args);
    }

}
