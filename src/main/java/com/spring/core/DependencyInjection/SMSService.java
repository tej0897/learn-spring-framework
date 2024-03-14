package com.spring.core.DependencyInjection;

public class SMSService implements MessageService{

    @Override
    public void sendMessage(String message){
        System.out.println(message+" from SMSService");
    }
}
