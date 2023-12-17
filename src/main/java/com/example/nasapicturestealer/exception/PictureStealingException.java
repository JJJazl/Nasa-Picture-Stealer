package com.example.nasapicturestealer.exception;

public class PictureStealingException extends RuntimeException {
    public PictureStealingException(String message, Exception e) {
        super(message, e);
    }

    public PictureStealingException(String message) {
        super(message);
    }
}
