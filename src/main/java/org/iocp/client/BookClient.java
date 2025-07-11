package org.iocp.client;

import org.iocp.service.BookService;

public class BookClient {
    private final BookService bookService;

    public BookClient(BookService bookService) {
        this.bookService = bookService;
    }
    public void print(String name){
        bookService.display(name);
    }
}
