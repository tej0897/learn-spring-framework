package com.spring.core.LazyVsEagerLoader;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {

    public EagerLoader(){
        System.out.println("Eager loader...");

    }
}
