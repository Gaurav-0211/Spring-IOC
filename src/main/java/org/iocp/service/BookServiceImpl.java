package org.iocp.service;

public class BookServiceImpl implements BookService {

    @Override
    public void display(String name) {
        System.out.println("Book Name is : "+name);
    }
}
