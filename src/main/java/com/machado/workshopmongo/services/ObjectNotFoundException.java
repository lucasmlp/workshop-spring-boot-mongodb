package com.machado.workshopmongo.services;

public class ObjectNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 7847107995458762928L;
    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
