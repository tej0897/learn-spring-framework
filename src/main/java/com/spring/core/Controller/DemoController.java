package com.spring.core.Controller;


import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    public String hello(){
        return "Hello from Controller!";
    }
}
