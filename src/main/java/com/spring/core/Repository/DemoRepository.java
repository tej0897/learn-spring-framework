package com.spring.core.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {

    public String hello(){
        return "Hello from Repo!";
    }
}
