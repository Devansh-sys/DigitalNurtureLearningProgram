package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    // The service has a dependency on the repository
    private final BookRepository bookRepository;

    // A constructor for Spring to inject the dependency
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void manageBook() {
        System.out.println("BookService is managing a book operation.");
        bookRepository.findBook();
    }
}
