package cn.edu.bupt.ipoc.onps.base.exception;

public class InsufficientResourceException extends Exception {
    public InsufficientResourceException(){}
    public InsufficientResourceException(String msg){
        super(msg);
    }
}
