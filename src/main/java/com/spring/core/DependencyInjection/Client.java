package com.spring.core.DependencyInjection;

public class Client {

    public static void main(String[] args) {
        String message = "Hello World!! Good morning!";
        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();
        MessageSender messageSender = new MessageSender(smsService);

        messageSender.sendMessage(message);
    }

}
