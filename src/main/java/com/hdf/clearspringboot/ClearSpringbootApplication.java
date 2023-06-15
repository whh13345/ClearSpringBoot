package com.hdf.clearspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hdf.clearspringboot.controller.HelloController;

@SpringBootApplication
public class ClearSpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ClearSpringbootApplication.class, args);
        HelloController obj = (HelloController)run.getBean("helloController");
        obj.mm();

    }

}
