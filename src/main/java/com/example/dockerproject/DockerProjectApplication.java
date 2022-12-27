package com.example.dockerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@EnableAutoConfiguration
@Configuration
public class DockerProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerProjectApplication.class, args);
System.out.println("hello");




    }
}
