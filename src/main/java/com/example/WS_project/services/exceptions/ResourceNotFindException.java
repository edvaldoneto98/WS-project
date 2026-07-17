package com.example.WS_project.services.exceptions;

public class ResourceNotFindException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFindException(Object id) {
        super("Resource not found. Id " + id);
    }
}

