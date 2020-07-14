package com.julio.microservice_user.exception;

public class AuthorizationException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public AuthorizationException(final String msg) {
        super(msg);
    }

    public AuthorizationException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
