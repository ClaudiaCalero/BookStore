package com.BookStore.service;

import com.BookStore.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
        @Autowired
        BookService bookService;

        @Test
        public void addBook() {
            Book book = new Book();
            book.setId(1);
            book.setTitle("Pride & Prejudice");
            book.setAuthor("Jane Auten");
            book.setGenre("Romance/Drama");
            book.setLaunchDate("12-01-1813");

            bookService.saveBook(book);
        }
}
