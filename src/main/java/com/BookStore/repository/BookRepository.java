package com.BookStore.repository;

import com.BookStore.model.Book;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository {

    Book save(Book book);

    List<Book> saveAll(List<Book> books);

    List<Book> findAll();

    Optional<Object> findById(Long id);

    Book findByTitle(String title);

    Optional<Object> findByBookId(long id);

    void deleteById(Long id);
}
