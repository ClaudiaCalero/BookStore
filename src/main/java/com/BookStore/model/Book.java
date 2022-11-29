package com.BookStore.model;

import org.springframework.http.ResponseEntity;

import java.util.List;

public class Book {
   private long id;
   private String title;
   private String author;
    private String genre;
   private String launchDate;

    public Book(long id, String title, String author, String genre, String launchDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.launchDate = launchDate;
    }

    public Book() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

}
