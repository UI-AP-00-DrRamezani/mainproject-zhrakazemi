package com.company.Exceptions;

public class InvalidShopException extends RuntimeException{
    public InvalidShopException(String message) {
        super(message);
    }
}
