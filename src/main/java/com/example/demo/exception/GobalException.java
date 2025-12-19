package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GobalException{
    @ExceptionHandler(ValidationException.class)
    public Res




}