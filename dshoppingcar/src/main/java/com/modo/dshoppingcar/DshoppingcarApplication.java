package com.modo.dshoppingcar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.modo.dshoppingcar.dao")
public class DshoppingcarApplication {

    public static void main(String[] args) {
        SpringApplication.run(DshoppingcarApplication.class, args);
    }

}
