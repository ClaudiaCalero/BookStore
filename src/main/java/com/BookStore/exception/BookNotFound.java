package com.BookStore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BookNotFound extends Throwable {
    public BookNotFound(String message){
        super();
    }
}
