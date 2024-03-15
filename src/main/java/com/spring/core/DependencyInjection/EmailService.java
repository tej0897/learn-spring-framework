package com.spring.core.DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements MessageService{

    @Override
    public void sendMessage(String message){
        System.out.println(message+" from EmailService");
    }
}
