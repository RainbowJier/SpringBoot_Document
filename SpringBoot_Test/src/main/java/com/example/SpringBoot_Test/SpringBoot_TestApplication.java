package com.example.SpringBoot_Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringBoot_TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot_TestApplication.class, args);
    }

}
