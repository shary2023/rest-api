package com.github.shary2023.core.exception;

public class UndefinedSaveException extends RuntimeException {
    public UndefinedSaveException() {
        super("Error saving entity to database");
    }

    public UndefinedSaveException(String message) {
        super(message);
    }
}
