package org.ioc_anno;

import org.ioc_anno.config.AppConfig;
import org.ioc_anno.client.GreetClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        GreetClient client = context.getBean(GreetClient.class);
        client.sendGreeting("Gaurav");
    }
}
