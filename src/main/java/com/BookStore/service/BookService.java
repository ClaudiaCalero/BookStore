package com.BookStore.service;

import com.BookStore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.BookStore.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    static
    BookRepository bookRepository;


    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> saveBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findByBookId(Long id) {
        return (Book) bookRepository.findById(id).orElse(null);
    }

    public Book findByBookTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public Book updateBook(Book book) {
        Book existingBook = (Book) bookRepository.findById(book.getId()).orElse(null);
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setGenre(book.getGenre());
        existingBook.setLaunchDate(book.getLaunchDate());
        return bookRepository.save(existingBook);
    }

    public String deleteBook(Long id) {
        bookRepository.deleteById(id);
        return "book removed from inventory " + id;
    }


}
