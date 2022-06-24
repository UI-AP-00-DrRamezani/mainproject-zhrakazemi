package com.company.Exceptions;

public class AbsentGoodException extends InvalidShopException {
    public AbsentGoodException(String message) {
        super("InValid Shopping :  "+message);
    }
}
