package com.largescreen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LargescreenApplication {

    public static void main(String[] args) {
        SpringApplication.run(LargescreenApplication.class, args);
    }

}
