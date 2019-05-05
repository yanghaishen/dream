package com.lxff.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DreamServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DreamServerApplication.class, args);
    }

}
