package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {
        // Load the context, which will trigger the bean creation and injections
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the fully configured bean
        BookService bookService = context.getBean("bookService", BookService.class);

        // Test the bean's method
        bookService.manageBook();
    }
}
