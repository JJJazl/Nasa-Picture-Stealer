package com.example.nasapicturestealer.exception;

public class JsonNodeParseException extends RuntimeException {
    public JsonNodeParseException(String message, Exception e) {
        super(message, e);
    }
}
