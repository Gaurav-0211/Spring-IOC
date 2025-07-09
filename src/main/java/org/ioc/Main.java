package org.ioc;

import org.ioc.client.MessageClient;
import org.ioc.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageClient client = context.getBean(MessageClient.class);
        client.processMessage("Hello from Spring Java Config!");
    }
}