package com.learningproject.xablaux.services.exceptions;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
