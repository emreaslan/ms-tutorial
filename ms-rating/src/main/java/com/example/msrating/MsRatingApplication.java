package com.example.msrating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsRatingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsRatingApplication.class, args);
    }

}
