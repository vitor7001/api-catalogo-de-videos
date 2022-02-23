package com.vitor.CatalogoVideo.domain;

public class NotBlankException extends DomainException{
 
    public NotBlankException(){
        super();
    }
    
    public NotBlankException(String message){
        super(message);
    }

}
