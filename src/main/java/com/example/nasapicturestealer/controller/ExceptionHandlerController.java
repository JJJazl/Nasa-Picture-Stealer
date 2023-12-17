package com.example.nasapicturestealer.controller;

import com.example.nasapicturestealer.exception.PictureStealingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(PictureStealingException.class)
    public ResponseEntity<String> handlePictureStealingException(PictureStealingException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(e.getMessage());
    }
}
