package com.library.repository;

import com.library.model.Book;
import org.springframework.data.repository.CrudRepository;

// By extending CrudRepository, BookRepository inherits methods for CRUD operations [3]
// The generic types are the entity (Book) and its primary key type (Long).
public interface BookRepository extends CrudRepository<Book, Long> {
    // You can define custom query methods here if needed.
}
