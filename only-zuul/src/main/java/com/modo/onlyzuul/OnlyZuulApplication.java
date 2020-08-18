package com.modo.onlyzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class OnlyZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlyZuulApplication.class, args);
    }

}
