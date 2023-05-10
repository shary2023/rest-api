package com.github.shary2023.core.exception.error;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ApplicationError {
    private int statusCode;
    private String message;
    private List<String> errorMessages;

    public ApplicationError(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public ApplicationError(int statusCode, List<String> errorMessages) {
        this.statusCode = statusCode;
        this.errorMessages = errorMessages;
    }
}
