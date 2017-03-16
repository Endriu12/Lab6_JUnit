package com.perepelitsya;


public class WrongTypeException extends Exception {
    public WrongTypeException(){

    }
    public WrongTypeException(String message){
        super(message);
    }
    public WrongTypeException(Throwable cause){
        super(cause);
    }
    public WrongTypeException(String message, Throwable cause){
        super(message, cause);
    }
}
