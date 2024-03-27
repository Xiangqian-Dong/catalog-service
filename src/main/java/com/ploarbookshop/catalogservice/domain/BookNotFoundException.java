package com.ploarbookshop.catalogservice.domain;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        super("The Book with ISBN " + isbn + " was not found.");
    }
}
