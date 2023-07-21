package com.hdf.clearspringboot.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Log log = LogFactory.getLog(HelloController.class);

    @RequestMapping("/")
    public String hello() {
        log.info("123");
        return "hello world";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

}
