package com.BookStore.repository;

import com.BookStore.model.Book;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class BookRepository {
    private List<Book> books;

    public BookRepository() {
        books = new ArrayList();
    }

    public Book save(Book book) {
        books.add(book);
        return book;
    }

    public List<Book> saveAll(List<Book> books){
        for(int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            //acceder metodos dentro de la clase (this)
            this.save(book);
        }
        //tornar llista dins la meva clase return this.books
        return books; //només parametre
    }

    public List<Book> findAll(){
        books.size();
        return books;
    }
    public Optional<Book> findById(long id){
        for(int i = 0; i < books.size(); i++){
            Book book = books.get(i);
            long bookId = book.getId();
            if(bookId == id){
                return Optional.of(book);
            }
        }
        return null;
    }
    public Book findByTitle(String title){
        for(int i = 0; i < books.size(); i++)
    }

    public void deleteById(Long id){
    }
}

/*
* @Repository
public class BookRepository {
  private List<Book> books;

  public BookRepository() {
    books = new ArrayList()
  }

  Book save(Book book) {
    books.push(book);
  }
}*/