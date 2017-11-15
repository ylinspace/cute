package com.cute;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public String hello() {
        return "Hello Springboot!";
    }
}
