package org.ioc_anno.service;

public class HelloGreetService implements GreetingService{
    @Override
    public void greet(String name) {
        System.out.println("Hello "+ name+" !!");
    }
}
