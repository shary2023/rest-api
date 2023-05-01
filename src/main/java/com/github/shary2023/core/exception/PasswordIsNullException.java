package com.github.shary2023.core.exception;

public class PasswordIsNullException extends RuntimeException {
    public PasswordIsNullException() {
        super("Password cannot be null for this role");
    }
}
