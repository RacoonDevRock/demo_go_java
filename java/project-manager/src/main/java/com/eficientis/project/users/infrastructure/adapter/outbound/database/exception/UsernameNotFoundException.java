package com.eficientis.project.users.infrastructure.adapter.outbound.database.exception;

public class UsernameNotFoundException extends RuntimeException {
    public UsernameNotFoundException(String message) {
        super(message);
    }

    protected UsernameNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
