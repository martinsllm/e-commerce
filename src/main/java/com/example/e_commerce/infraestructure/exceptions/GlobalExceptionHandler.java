package com.example.e_commerce.infraestructure.exceptions;

import java.time.LocalDateTime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import feign.FeignException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<ErrorResponse> handlerBusinessException(FeignException ex, HttpServletRequest request) {
        return response(ex.contentUTF8(), request, ex.status(), LocalDateTime.now());
    }

    private ResponseEntity<ErrorResponse> response(final String message, final HttpServletRequest request, int status, LocalDateTime data) {
        return ResponseEntity
            .status(status)
            .body(new ErrorResponse(message, data, status, request.getRequestURI()));
    }
    
}
