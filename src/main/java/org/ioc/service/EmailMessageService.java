package org.ioc.service;

import org.springframework.stereotype.Component;

@Component
public class EmailMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email Message : "+ message);
    }
}
