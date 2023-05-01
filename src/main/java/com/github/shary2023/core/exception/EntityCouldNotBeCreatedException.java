package com.github.shary2023.core.exception;

public class EntityCouldNotBeCreatedException extends RuntimeException {
    public EntityCouldNotBeCreatedException() {
        super("Entity could not be created.");
    }

    public EntityCouldNotBeCreatedException(String message) {
        super(message);
    }
}
