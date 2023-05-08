package com.github.shary2023.core.exception.handler;

import com.github.shary2023.core.exception.*;
import com.github.shary2023.core.exception.error.ApplicationError;
import com.github.shary2023.core.exception.error.FieldsValidationError;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.TransientPropertyValueException;
import org.postgresql.util.PSQLException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ApplicationError> catchResourceNotFoundException(ResourceNotFoundException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.NOT_FOUND.value(), e.getMessage()),
                HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ApplicationError> catchUpdateRequestException(UpdateRequestException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.BAD_REQUEST.value(), e.getMessage()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<ApplicationError> catchUpdateRequestInsufficientRightsException(UpdateRequestInsufficientRightsException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.FORBIDDEN.value(), e.getMessage()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<ApplicationError> catchItemNotAvailableForRentException(ItemNotAvailableForRentException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.FORBIDDEN.value(), e.getMessage()),
                HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler
    public ResponseEntity<ApplicationError> catchPasswordIsNullException(PasswordIsNullException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.BAD_REQUEST.value(), e.getMessage()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<ApplicationError> catchUserAllReadyExistsException(UserAllReadyExistsException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.BAD_REQUEST.value(), e.getMessage()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<ApplicationError> catchFailedItemVerificationException(FailedItemVerificationException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.FORBIDDEN.value(), e.getMessage()),
                HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler
    public ResponseEntity<ApplicationError> catchUndefinedSaveException(UndefinedSaveException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.FORBIDDEN.value(), e.getMessage()),
                HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler
    public ResponseEntity<ApplicationError> catchUnsupportedRentServiceException(UnsupportedRentServiceException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.BAD_REQUEST.value(), e.getMessage()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<ApplicationError> catchEntityCouldNotBeCreatedException(EntityCouldNotBeCreatedException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.BAD_REQUEST.value(), e.getMessage()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PSQLException.class)
    public ResponseEntity<ApplicationError> catchPSQLException(PSQLException e) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.FORBIDDEN.value(), e.getMessage()),
                HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<FieldsValidationError> catchModelFieldDataValidationException(
            MethodArgumentNotValidException e) {
        log.error(String.valueOf(e));
        List<String> errorMessages = e.getBindingResult().getFieldErrors().stream()
                .map(err -> Objects.requireNonNull(err.getDefaultMessage()))
                .distinct()
                .toList();
        return new ResponseEntity<>(new FieldsValidationError(errorMessages), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<FieldsValidationError> catchIllegalArgumentException(
            IllegalArgumentException e) {
        log.error(String.valueOf(e));
        e.printStackTrace();
        List<String> errorMessages = new ArrayList<>(List.of(e.getMessage()));
        return new ResponseEntity<>(new FieldsValidationError(errorMessages), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<FieldsValidationError> catchEntityNotFoundException(
            EntityNotFoundException e) {
        log.error(String.valueOf(e));
        e.printStackTrace();
        List<String> errorMessages = new ArrayList<>(List.of(e.getMessage()));
        return new ResponseEntity<>(new FieldsValidationError(errorMessages), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<FieldsValidationError> catchEntityNotFoundException(
            ConstraintViolationException e) {
        log.error(String.valueOf(e));
        List<String> errorMessages = e.getConstraintViolations().stream().map(err -> Objects.requireNonNull(err.getMessage()))
                .distinct()
                .toList();
        e.printStackTrace();
        return new ResponseEntity<>(new FieldsValidationError(errorMessages), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(TransientPropertyValueException.class)
    public ResponseEntity<FieldsValidationError> catchTransientPropertyValueException(
            TransientPropertyValueException e) {
        log.error(String.valueOf(e));
        List<String> errorMessages = new ArrayList<>(List.of(e.getMessage()));
        e.printStackTrace();
        return new ResponseEntity<>(new FieldsValidationError(errorMessages), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<ApplicationError> catchBadCredentialsException (
            BadCredentialsException  e
    ) {
        log.error(String.valueOf(e));
        return new ResponseEntity<>(new ApplicationError(HttpStatus.UNAUTHORIZED.value(), e.getMessage()),
                HttpStatus.UNAUTHORIZED);
    }

}
