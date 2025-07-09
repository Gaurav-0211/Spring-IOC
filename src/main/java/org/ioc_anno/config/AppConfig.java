package org.ioc_anno.config;

import org.ioc_anno.client.GreetClient;
import org.ioc_anno.service.GreetingService;
import org.ioc_anno.service.HelloGreetService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public GreetingService greetingService(){
        return new HelloGreetService();
    }
    @Bean
    public GreetClient greetClient(){
        return new GreetClient(greetingService());
    }
}
