package com.application.grandslam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class GrandSlamApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrandSlamApplication.class, args);
    }

}
