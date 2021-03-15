package com.fernando.msstore.shared.exception;

public class ApiException extends RuntimeException {

    private static final long serialVersionUID = 6218945080387548829L;

    public ApiException() {}

    public ApiException(String message) {
        super(message);
    }
}
