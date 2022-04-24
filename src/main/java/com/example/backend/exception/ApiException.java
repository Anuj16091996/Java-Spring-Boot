package com.example.backend.exception;

import org.springframework.http.HttpStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class ApiException {
    private  String Message;
    private  HttpStatus httpStatus;
    private  LocalDateTime zonedDateTime;

    public ApiException(String message, HttpStatus httpStatus, LocalDateTime zonedDateTime) {
        this.Message = message;
        this.httpStatus = httpStatus;
        this.zonedDateTime = zonedDateTime ;
    }

    public String getMessage() {
        return Message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

}
