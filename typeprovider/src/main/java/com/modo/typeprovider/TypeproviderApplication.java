package com.modo.typeprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaClient
@CrossOrigin
@MapperScan("com.modo.typeprovider.dao")
public class TypeproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TypeproviderApplication.class, args);
    }

}
