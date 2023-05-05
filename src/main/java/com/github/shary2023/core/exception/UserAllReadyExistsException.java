package com.github.shary2023.core.exception;

public class UserAllReadyExistsException extends RuntimeException {
    public UserAllReadyExistsException() {
        super("User with this name or email exists");
    }
}
