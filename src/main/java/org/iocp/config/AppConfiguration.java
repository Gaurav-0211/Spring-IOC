package org.iocp.config;

import org.iocp.client.BookClient;
import org.iocp.service.BookService;
import org.iocp.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public BookService book(){
        return new BookServiceImpl();
    }

    @Bean
    public BookClient bookClient(){
        return new BookClient(book());
    }
}
