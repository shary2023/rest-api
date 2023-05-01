package com.github.shary2023.core.exception.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationError {
    private int statusCode;
    private String message;
}
