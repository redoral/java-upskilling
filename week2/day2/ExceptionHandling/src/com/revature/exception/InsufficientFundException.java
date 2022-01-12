package com.revature.exception;

public class InsufficientFundException extends Exception {
    public InsufficientFundException() {
        super();
    }

    public InsufficientFundException(String message) {
        super(message);
    }

    public InsufficientFundException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficientFundException(Throwable cause) {
        super(cause);
    }
}
