package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    // The dependency is declared but not initialized.
    private BookRepository bookRepository;

    // A public setter method for Spring to inject the BookRepository bean.
    // The method name 'setBookRepository' follows JavaBean conventions.
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter method called: Injecting BookRepository.");
        this.bookRepository = bookRepository;
    }

    public void manageBook() {
        if (bookRepository == null) {
            System.out.println("Error: BookRepository has not been injected!");
            return;
        }
        System.out.println("BookService is managing a book operation.");
        bookRepository.findBook();
    }
}
