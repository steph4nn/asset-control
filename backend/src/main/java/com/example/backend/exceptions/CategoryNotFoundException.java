package com.example.backend.exceptions;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(int id) {
        super("Could not find category " + id);
    }
}