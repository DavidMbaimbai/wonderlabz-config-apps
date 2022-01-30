package com.config.wonderlabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class WonderlabzApplication {

    public static void main(String[] args) {
        SpringApplication.run(WonderlabzApplication.class, args);
    }

}
