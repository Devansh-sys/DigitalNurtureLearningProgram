package com.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Marks this class as a JPA entity (a table in the database) [3]
public class Book {

    @Id // Specifies the primary key of the entity [3]
    @GeneratedValue(strategy = GenerationType.AUTO) // Configures the ID to be auto-generated [3]
    private Long id;
    private String title;
    private String author;

    // A default constructor is required by JPA [3]
    protected Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Standard getters and setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}
