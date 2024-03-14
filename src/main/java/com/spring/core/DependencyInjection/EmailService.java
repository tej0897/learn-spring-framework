package com.spring.core.DependencyInjection;

public class EmailService implements MessageService{

    @Override
    public void sendMessage(String message){
        System.out.println(message+" from EmailService");
    }
}
