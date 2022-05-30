package com.company.Exceptions;

public class LackOfBudgetException extends InvalidShopException {
    public LackOfBudgetException(String message) {
        super("Invalid Shopping :  "+message);
    }
}
