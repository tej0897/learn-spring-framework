package com.spring.core.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private MessageService messageService;

    private MessageService smsService;


    public MessageSender(@Qualifier("emailService") MessageService messageService){
        this.messageService = messageService;
        System.out.println("Constructor based DI - 1");
    }

    @Autowired
    public MessageSender(MessageService messageService,
                         MessageService smsService){
        this.messageService = messageService;
        this.smsService = smsService;
        System.out.println("Constructor based DI - 2");
    }

    public void sendMessage(String message){
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }

}
