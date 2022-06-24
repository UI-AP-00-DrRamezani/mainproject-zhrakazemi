package com.company.Exceptions;

public class InvalidPhoneNumberException extends InvalidDataException {
    public InvalidPhoneNumberException(String message) {
        super("InValid input :  "+message);
    }
}
