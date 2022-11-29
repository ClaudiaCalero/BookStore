package com.BookStore.controller;

import com.BookStore.model.Book;
import com.BookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/addBooks")
    public List<Book> addBooks(@RequestBody List<Book> books) {
        return bookService.saveBooks(books);
    }

    @GetMapping("/books")
    public List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/bookById/{id}")
    public Book findByBookId(@PathVariable Long id) {
        return bookService.findByBookId(id);
    }

    @GetMapping("/book/{name}")
    public Book findByBookTitle(@PathVariable String title) {
        return bookService.findByBookTitle(title);
    }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }

}




