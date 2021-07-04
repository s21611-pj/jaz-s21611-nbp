package com.example.jazs21611nbp.advice;

import com.example.jazs21611nbp.model.ErrorModel;
import com.example.jazs21611nbp.model.NbpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.time.Instant;
import java.time.LocalDate;
import java.util.NoSuchElementException;


@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<Object> handle_4XX_Exceptions(HttpClientErrorException exception) {
        if (exception.getStatusCode().equals(HttpStatus.NOT_FOUND))
            return new ResponseEntity<>(new ErrorModel(HttpStatus.NOT_FOUND.value(), exception.toString(), Instant.now()), HttpStatus.NOT_FOUND);
        if (exception.getStatusCode().equals(HttpStatus.BAD_REQUEST))
            return new ResponseEntity<>(new ErrorModel(HttpStatus.BAD_REQUEST.value(), exception.toString(), Instant.now()), HttpStatus.BAD_REQUEST);
        return ResponseEntity.ok().build();
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Object> handleNSEL(NoSuchElementException exception) {
        return new ResponseEntity<>(new ErrorModel(HttpStatus.NOT_FOUND.value(), exception.toString(), Instant.now()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(HttpServerErrorException.BadGateway.class)
    @ResponseStatus(value = HttpStatus.BAD_GATEWAY)
    public ResponseEntity<Object> handleIntervalServerException(HttpServerErrorException exception) {
        return new ResponseEntity<>(new ErrorModel(HttpStatus.BAD_GATEWAY.value(), exception.toString(), Instant.now()), HttpStatus.BAD_GATEWAY);
    }
}

