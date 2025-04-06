package com.eficientis.project.projects.application.excepcion;

public class NotFoundProjectException extends RuntimeException {
    public NotFoundProjectException(String message) {
        super(message);
    }

    protected NotFoundProjectException(String message, Throwable cause) {
        super(message, cause);
    }
}
