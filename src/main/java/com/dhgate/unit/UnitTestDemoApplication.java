package com.dhgate.unit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.dhgate")
public class UnitTestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnitTestDemoApplication.class, args);
    }

}
