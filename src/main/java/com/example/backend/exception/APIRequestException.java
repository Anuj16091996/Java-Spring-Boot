package com.example.backend.exception;

public class APIRequestException extends RuntimeException{

    public APIRequestException(String message) {
        super(message);
    }
}
