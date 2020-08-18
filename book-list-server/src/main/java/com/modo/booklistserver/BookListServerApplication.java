package com.modo.booklistserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.modo.booklistserver.dao")
public class BookListServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookListServerApplication.class, args);
    }

}
