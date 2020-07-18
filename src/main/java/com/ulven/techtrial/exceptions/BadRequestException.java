package com.ulven.techtrial.exceptions;

public final class BadRequestException extends RuntimeException {

    private static final long serialVersionUID = 5861310537366287163L;

    public BadRequestException() {
    }

    public BadRequestException(String message) {
        super(message);
    }
}
