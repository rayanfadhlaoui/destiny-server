package com.destiny.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.destiny.entities")
@ComponentScan(basePackages = {
        "com.destiny.controller",
        "com.destiny.services",
        "com.destiny.dao"
})
public class DestinyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DestinyApplication.class, args);
    }
}
