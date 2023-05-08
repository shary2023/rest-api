package com.github.shary2023.core.exception;

public class BadCredentialsException extends RuntimeException {

    public BadCredentialsException() {
        super("Insufficient authorization rights.");
    }

    public BadCredentialsException(String message) {
        super(message);
    }
}
