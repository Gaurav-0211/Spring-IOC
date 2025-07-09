package org.ioc_anno.client;

import org.ioc_anno.service.GreetingService;

public class GreetClient {
    private final GreetingService greetingService;

    public GreetClient(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sendGreeting(String name){
        greetingService.greet(name);
    }
}
