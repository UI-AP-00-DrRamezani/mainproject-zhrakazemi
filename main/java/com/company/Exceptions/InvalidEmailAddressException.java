package com.company.Exceptions;

public class InvalidEmailAddressException extends InvalidDataException {
    public InvalidEmailAddressException(String message) {
        super("InValid input :  "+message);
    }
}
