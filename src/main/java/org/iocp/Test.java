package org.iocp;

import org.iocp.client.BookClient;
import org.iocp.config.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        BookClient client = context.getBean(BookClient.class);
        client.print("The Moon");
    }
}
