package com.eficientis.project.users.application.exception;

public class UsernameNotFoundException extends RuntimeException {
    public UsernameNotFoundException(String message) {
        super(message);
    }

    protected UsernameNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
