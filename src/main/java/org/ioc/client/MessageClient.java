package org.ioc.client;

import org.ioc.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageClient {
    private final MessageService messageService;

    @Autowired
    public MessageClient(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String msg){
        messageService.sendMessage(msg);
    }

}
