package com.navneet.projects.airBnbApp.exception;
 
public class InvalidTokenException extends RuntimeException {
    public InvalidTokenException(String message) {
        super(message);
    }
}