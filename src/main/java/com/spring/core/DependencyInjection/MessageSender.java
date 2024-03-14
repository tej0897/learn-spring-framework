package com.spring.core.DependencyInjection;

public class MessageSender {

    private final MessageService messageService;

    public MessageSender(MessageService messageService){
        this.messageService = messageService;
    }

    public void sendMessage(String message){
        this.messageService.sendMessage(message);
    }

}
