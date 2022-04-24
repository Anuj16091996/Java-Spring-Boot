package com.example.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler  {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAPIRequestException(APIRequestException e) {
       ApiException information= new ApiException(e.getMessage(), HttpStatus.BAD_REQUEST, LocalDateTime.now() );
       return new ResponseEntity<Object>(information,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(APIRequestException.class)
    public ResponseEntity<Object> handleAPIRequestExceptions(APIRequestException e) {
//        ApiException information= new ApiException(e.getMessage(),  HttpStatus.BAD_REQUEST, LocalDateTime.now());
        return new ResponseEntity<Object>(new ApiException(e.getMessage(),HttpStatus.NOT_FOUND,LocalDateTime.now()),HttpStatus.BAD_REQUEST);
    }
}
