package com.example.demo.expection;
public class ValidationException extends RuntimeException{
    public ValidationException(String message){
        super(message);
    }
}