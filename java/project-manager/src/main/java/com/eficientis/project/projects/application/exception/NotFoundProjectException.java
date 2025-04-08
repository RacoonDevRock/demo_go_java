package com.eficientis.project.projects.application.exception;

public class NotFoundProjectException extends RuntimeException {
    public NotFoundProjectException(String message) {
        super(message);
    }

    protected NotFoundProjectException(String message, Throwable cause) {
        super(message, cause);
    }
}
