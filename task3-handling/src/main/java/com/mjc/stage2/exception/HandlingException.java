package com.mjc.stage2.exception;

public class HandlingException extends RuntimeException {
    public HandlingException() {
    }

    public HandlingException(String message) {
        super(message);
    }

    public HandlingException(String message, Throwable cause) {
        super(message, cause);
    }

    public HandlingException(Throwable cause) {
        super(cause);
    }
}
