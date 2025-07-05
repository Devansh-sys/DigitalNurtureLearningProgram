package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private final String librarianName; // To be injected via constructor
    private BookRepository bookRepository; // To be injected via setter

    // 1. Constructor for injecting a mandatory dependency (librarianName)
    public BookService(String librarianName) {
        System.out.println("Constructor called: Injecting librarianName.");
        this.librarianName = librarianName;
    }

    // 2. Setter for injecting an optional/changeable dependency (bookRepository)
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter called: Injecting bookRepository.");
        this.bookRepository = bookRepository;
    }

    public void manageBook() {
        System.out.println("Librarian '" + librarianName + "' is managing a book operation.");
        if (bookRepository != null) {
            bookRepository.findBook();
        } else {
            System.out.println("BookRepository is not available.");
        }
    }
}
